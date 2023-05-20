package syntax;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.HashMap;

public class AnnotationEx00 {
    // @Retention(RetentionPolicy.RUNTIME)
    @interface Cached { } // Nothing inside our annotation

    static class SomeObject {
        @Cached
        public String intensiveTask() throws InterruptedException {
            Thread.sleep(1000);
            return "expensive task result";
        }
    }

    static class SomeObjectExecutor {

        Map<String, String> cache = new HashMap<>();

        public String execute(SomeObject task) throws Exception {
            final Method intensiveTaskMethod = task.getClass().getDeclaredMethod("intensiveTask");
            if (intensiveTaskMethod.isAnnotationPresent(Cached.class)) {
                String className = task.getClass().getName();
                if (!cache.containsKey(className)) {
                    cache.put(className, task.intensiveTask());
                }
                return cache.get(className);
            }
            return task.intensiveTask();
        }
    }

    public static void main(String[] args) throws Exception {
        final SomeObjectExecutor someObjectExecutor = new SomeObjectExecutor();
        long time = System.currentTimeMillis();
        final SomeObject expensiveTaskObject = new SomeObject();
        someObjectExecutor.execute(expensiveTaskObject);
        System.out.println("First execution:" + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        someObjectExecutor.execute(expensiveTaskObject);
        System.out.println("Second execution:" + (System.currentTimeMillis() - time));
    }
}
