package com.dosmil_e.kit.browser.customapps;

import com.dosmil_e.browserbase.shell.EAIApplication;

import java.util.StringTokenizer;
import java.util.Properties;
import java.util.Enumeration;

import javax.swing.UIManager;
import java.awt.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class KitApplication extends EAIApplication {

  public static final String  sKitPilotFrameClassName = "com.dosmil_e.kit.browser.customwindows.KitPilotFrame";


 //Construct the application
  public KitApplication( String[] theArgs) {
    super( theArgs);
  }


  protected void initVars() {
    super.initVars();
    vDefaultPilotFrameClassName = sKitPilotFrameClassName;
  }


  //Main method
  public static void main(String[] theArgs) {
    try  {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
   }
    catch(Exception e) {
    }

    new KitApplication( theArgs);
  }





}


