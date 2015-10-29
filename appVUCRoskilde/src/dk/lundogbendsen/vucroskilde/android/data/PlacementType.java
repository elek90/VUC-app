package dk.lundogbendsen.vucroskilde.android.data;

public enum PlacementType
{
  NULL,     // No media file present
  ASSETS,   // In "assets"-folder within the .apk
  URL,      // http://.....
  STORAGE;  // Absolute path in file-system
}