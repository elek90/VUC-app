package dk.schoubo.library.android.helpers;

public enum MediaPlayerState
{
  CREATED(MediaPlayerCommand.NOOP),
  READY  (MediaPlayerCommand.PLAY),
  PLAYING(MediaPlayerCommand.PAUSE),
  PAUSING(MediaPlayerCommand.PLAY),

  ERROR  (MediaPlayerCommand.NOOP);

  private final MediaPlayerCommand command;
  public MediaPlayerCommand getCommand() { return command; }

  private MediaPlayerState(final MediaPlayerCommand command)
  {
    this.command = command;
  }
}