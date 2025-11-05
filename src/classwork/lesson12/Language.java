package classwork.lesson12;

public enum Language {

    HY("բարև"),EN("hello"),RU ("привет");

    private String hello;
    Language(String hello){
        this.hello=hello;
    }

    String getHello(){
        return hello;
    }
}
