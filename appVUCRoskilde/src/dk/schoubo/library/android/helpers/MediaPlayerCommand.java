package dk.schoubo.library.android.helpers;

public enum MediaPlayerCommand
{
  NOOP (android.R.drawable.ic_menu_close_clear_cancel),
  SCAN (android.R.drawable.ic_menu_search),
  PLAY (android.R.drawable.ic_media_play),
  PAUSE(android.R.drawable.ic_media_pause);

  private final int stateId;
  public int getStateId() { return stateId; }

  private MediaPlayerCommand(final int stateId)
  {
    this.stateId = stateId;
  }

}
