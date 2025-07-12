package ex_30_ENUM;

public enum Colors {
    //We will access this enum in Lab211_ENUM class
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexcode;
    Colors(String hexcode){
        this.hexcode=hexcode;
    }
    public String gethexcode(){
        return this.hexcode;
    }
}
