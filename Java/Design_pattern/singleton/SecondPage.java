package Design_pattern.singleton;

public class SecondPage {
  private Setting setting = Setting.getSetting();

  public void printSetting(){
    System.out.println(setting.getDarkMode()+" "+setting.getFontSize());
  }
}
