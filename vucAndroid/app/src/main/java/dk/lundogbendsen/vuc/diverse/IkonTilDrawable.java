package dk.lundogbendsen.vuc.diverse;


import java.util.HashMap;
import java.util.LinkedHashMap;

import dk.lundogbendsen.vuc.R;
import dk.lundogbendsen.vuc.domæne.Ikon;

/**
 * Created by j on 04-11-15.
 */
public class IkonTilDrawable {
  public static HashMap<Ikon, Integer> ikonTilDrawable = new LinkedHashMap<>();
  public static HashMap<Ikon, Integer> ikonfarver = new LinkedHashMap<>();

  static {
    ikonTilDrawable.put(Ikon.tom, 0);
    ikonTilDrawable.put(Ikon.mail, R.drawable.ta_apps_internet_mail);
    ikonTilDrawable.put(Ikon.bog, R.drawable.ta_mimetypes_x_office_address_book);
    ikonTilDrawable.put(Ikon.kamera, R.drawable.ta_devices_camera_photo);
    ikonTilDrawable.put(Ikon.mikrofon, R.drawable.ta_devices_audio_input_microphone);
    ikonTilDrawable.put(Ikon.foto, R.drawable.ta_devices_camera_photo);

    ikonTilDrawable.put(Ikon.noter_i_felten, R.drawable.ta_actions_edit_paste);
    ikonTilDrawable.put(Ikon.hjælp, R.drawable.ta_apps_help_browser);
    ikonTilDrawable.put(Ikon.mennesker, R.drawable.ta_apps_system_users);
    ikonTilDrawable.put(Ikon.video, R.drawable.ta_categories_applications_multimedia);
    ikonTilDrawable.put(Ikon.pen_og_blyant, R.drawable.ta_categories_applications_office);
    ikonTilDrawable.put(Ikon.lyd, R.drawable.ta_status_audio_volume_high);
    ikonTilDrawable.put(Ikon.vigtigt, R.drawable.ta_emblems_emblem_important);
    ikonTilDrawable.put(Ikon.pære, R.drawable.ta_status_dialog_information);
    ikonTilDrawable.put(Ikon.advarsel, R.drawable.ta_status_dialog_warning);
    ikonTilDrawable.put(Ikon.vedhæft, R.drawable.ta_status_mail_attachment);

    ikonTilDrawable.put(Ikon.pipette, R.drawable.oi_actions_color_picker_black);
    ikonTilDrawable.put(Ikon.hammer, R.drawable.oi_apps_development_2);

    ikonTilDrawable.put(Ikon.tavle, R.drawable.ta_mimetypes_x_office_presentation);
    ikonTilDrawable.put(Ikon.notesblok, R.drawable.ta_apps_accessories_text_editor);
    ikonTilDrawable.put(Ikon.værktøj, R.drawable.ta_categories_preferences_system);
    ikonTilDrawable.put(Ikon.reagensglas, R.drawable.oi_categories_applications_science_3);
    ikonTilDrawable.put(Ikon.kat_viden, R.drawable.ta_mimetypes_x_office_presentation);
    ikonTilDrawable.put(Ikon.kat_rapport, R.drawable.ta_apps_accessories_text_editor);
    ikonTilDrawable.put(Ikon.kat_udstyr, R.drawable.ta_categories_preferences_system);
    ikonTilDrawable.put(Ikon.kat_forsøg, R.drawable.oi_categories_applications_science_3);

    ikonfarver.put(Ikon.kat_viden, R.color.kgul);
    ikonfarver.put(Ikon.kat_udstyr, R.color.klgrøn);
    ikonfarver.put(Ikon.kat_forsøg, R.color.korange);
    ikonfarver.put(Ikon.kat_rapport, R.color.klblå);

    for (Ikon i : Ikon.values()) {
      if (ikonTilDrawable.get(i) == null) {
        Log.d("Ikon " + i + " mangler en drawable");
      }
    }
  }

}
