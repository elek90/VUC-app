package dk.lundogbendsen.vuc.diverse;

import dk.lundogbendsen.vuc.App;

/**
 * Created by j on 06-12-15.
 */
public class Diverse {
  /**
   * Fra
   * https://console.developers.google.com/apis/credentials?project=vuc-roskilde&authuser=0
   */
  public static final String YOUTUBE_NØGLE = "AIzaSyCq0w9sCXxhLFTzAakN4H99pBuwcZvUQAM";

  /**
   * Hack til at poste en Runnable allersidst i hovedtrådens eventkø, sådan at f.eks. en animation kan ses
   * @param forsinkelseMs
   * @param runnable
   */
  public static void udførSidstIHovedtråden(final int forsinkelseMs, final Runnable runnable) {
    App.hovedtråd.postDelayed(new Runnable() {
      int n=0;
      @Override
      public void run() {
        Log.d("udførSidstIHovedtråden "+n);
        if (n++<2) {
          App.hovedtråd.postDelayed(this,forsinkelseMs/3);
          return;
        }
        runnable.run();
      }
    },forsinkelseMs/3);
  }
}
