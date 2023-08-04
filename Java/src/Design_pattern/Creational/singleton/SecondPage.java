package Design_pattern.Creational.singleton;

public class SecondPage {
  private Setting setting = Setting.getSetting();

  public void printSetting(){
    System.out.println(setting.getDarkMode()+" "+setting.getFontSize());
  }
}
