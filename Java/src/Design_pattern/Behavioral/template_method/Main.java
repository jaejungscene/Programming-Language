package Design_pattern.Behavioral.template_method;
//추상 클래스 선생님
abstract class Teacher{

    public void start_class() {
        inside();
        attendance();
        teach();
        exam();
        outside();
    }

    // 공통 메서드
    public void inside() {
        System.out.println("선생님이 강의실로 들어옵니다.");
    }

    public void attendance() {
        System.out.println("선생님이 출석을 부릅니다.");
    }

    public void outside() {
        System.out.println("선생님이 강의실을 나갑니다.");
    }

    //hook
    public void exam(){};

    // 추상 메서드
    abstract void teach();
}

// 국어 선생님
class Korean_Teacher extends Teacher{

    @Override
    public void teach() {
        System.out.println("선생님이 국어를 수업합니다.");
    }
}

//수학 선생님
class Math_Teacher extends Teacher{

    @Override
    public void teach() {
        System.out.println("선생님이 수학을 수업합니다.");
    }

    @Override
    public void exam() {
        System.out.println("수학 시험지를 나누어 줍니다.");
    }
}

//영어 선생님
class English_Teacher extends Teacher{

    @Override
    public void teach() {
        System.out.println("선생님이 영어를 수업합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Korean_Teacher kr = new Korean_Teacher(); //국어
        Math_Teacher mt = new Math_Teacher(); //수학
        English_Teacher en = new English_Teacher(); //영어

        kr.start_class();
        System.out.println("----------------------------");
        mt.start_class();
        System.out.println("----------------------------");
        en.start_class();
    }
}
