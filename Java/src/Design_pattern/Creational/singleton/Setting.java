package Design_pattern.Creational.singleton;


public class Setting {
  // private Setting(){}
  private static Setting setting = null;

  public static Setting getSetting() {
    if (setting == null)
      setting = new Setting();
    return setting;
  }

  private boolean darkMode = false;
  private int fontSize = 12;

  public boolean getDarkMode() {
    return darkMode;
  }

  public int getFontSize() {
    return fontSize;
  }

  public void setDarkMode(boolean bool) {
    this.darkMode = bool;
  }

  public void setFontSize(int size) {
    this.fontSize = size;
  }
}
