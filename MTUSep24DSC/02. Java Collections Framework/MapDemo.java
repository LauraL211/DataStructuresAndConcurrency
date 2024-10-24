// package com.company;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
   This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
   public static void main(String[] args)
   {      
      Map<String, Color> favoriteColors = new HashMap<String, Color>();
      // favoriteColors.put("Laura", Color.PURPLE);
         //This doesn't work as purple is not considered to be one
      Color PURPLE = new Color(160, 32, 240);
      favoriteColors.put("Laura", PURPLE);
      //My aspirations were to have PURPLE being used with Color, so it could work once the variable was set
      // .... unfortunately that was not the case, but learned how to set a new color variable

      favoriteColors.put("Juliet", Color.BLUE);
      favoriteColors.put("Romeo", Color.GREEN);
      favoriteColors.put("Adam", Color.MAGENTA);
      favoriteColors.put("Eve", Color.BLUE);
      favoriteColors.put("Kay", Color.BLUE);
      favoriteColors.put("Kay", Color.ORANGE);// modifies value of existing key

      Color kaysFavoriteColor = favoriteColors.get("Kay");
      System.out.println(kaysFavoriteColor);//expect Color.ORANGE);

      // Print all keys and values in the map

      Set<String> keySet = favoriteColors.keySet();
      for (String key : keySet)
      {
         Color value = favoriteColors.get(key);
         System.out.println(key + " : " + value + " : " + favoriteColors.get(key));
      }
   }
}
