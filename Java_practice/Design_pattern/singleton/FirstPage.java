package Design_pattern.singleton;
public class FirstPage {

  private Setting setting = Setting.getSetting();

  public void printSetting(){
    setting.setDarkMode(true);
    setting.setFontSize(234);
    System.out.println(setting.getDarkMode()+" "+setting.getFontSize());
  }
}
