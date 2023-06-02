package Dependency_Injection;

public class MyApplication implements Consumer{
    private MessageService service;

    public MyApplication(MessageService service){
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec); // this can be Email's sendMessage or SMS's sendMessage.
    }
}
