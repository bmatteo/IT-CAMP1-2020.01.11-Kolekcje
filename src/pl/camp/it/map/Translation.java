package pl.camp.it.map;

public class Translation {
    String english;
    String spain;
    String france;
    String lastCallDate;

    public Translation(String english, String spain, String france, String lastCallDate) {
        this.english = english;
        this.spain = spain;
        this.france = france;
        this.lastCallDate = lastCallDate;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "english='" + english + '\'' +
                ", spain='" + spain + '\'' +
                ", france='" + france + '\'' +
                ", lastCallDate='" + lastCallDate + '\'' +
                '}';
    }
}
