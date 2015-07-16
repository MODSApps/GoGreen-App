/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
***/
package org.example.sudoku;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class Sudoku extends Activity implements OnClickListener {
   private static final String TAG = "Go Green";

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      // Set up click listeners for all the buttons
      View continueButton = findViewById(R.id.continue_button);
      continueButton.setOnClickListener(this);
      View game_button = findViewById(R.id.new_button);
      game_button.setOnClickListener(this);
      View aboutButton = findViewById(R.id.map_button);
      aboutButton.setOnClickListener(this);
      View exitButton = findViewById(R.id.exit_button);
      exitButton.setOnClickListener(this);
   }

   // ...
   public void onClick(View v) {
      switch (v.getId()) {
      case R.id.continue_button:
          Intent i = new Intent(this, About.class);
          startActivity(i);
          Log.d(TAG, "Info was clicked on!");
          break;
      case R.id.new_button:
        // openGames();
          launchApp(v);
         break;
          case R.id.map_button:
              //openMap();
              Intent j=new Intent(this,Map.class);
              startActivity(j);
              break;
      case R.id.exit_button:
         Log.d(TAG,"Exit was clicked on!");
         finish();
         break;
      }
   }


   
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      super.onCreateOptionsMenu(menu);
      MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.menu, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
      case R.id.settings:
         startActivity(new Intent(this, Prefs.class));
         return true;
      // More items go here (if any) ...
      }
      return false;
   }

   /** Ask the user what difficulty level they want */
   public void launchApp(View v){
       Intent LaunchIntent = getPackageManager()
               .getLaunchIntentForPackage("com.deitel.flagquiz");
       startActivity(LaunchIntent);

   }

   private void openGames() {
      new AlertDialog.Builder(this)
           .setTitle(R.string.new_game_title)
           .setItems(R.array.difficulty,
            new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialoginterface,
                     int i) {
                  startGame(i);
               }
            })
           .show();
   }

   private void openMap() {
       new AlertDialog.Builder(this)
               .setTitle(R.string.test)
               .setItems(R.array.Map,
                       new DialogInterface.OnClickListener() {
                           public void onClick(DialogInterface dialoginterface,
                                               int i) {
                               pressMap();
                           }
                       })
               .show();
   }

   /** Start a new game with the given difficulty level */
   private void startGame(int i) {
      Log.d(TAG, "Game was clicked on, with difficulty " + i);
      // Start game here...
   }

    private void pressMap(){
        Log.d(TAG,"Map was clicked on!");
    }

   }
