// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cesar/Code/github/play-framework/java/sandbox/test-v180804/conf/routes
// @DATE:Sun Aug 05 01:08:13 BRT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTestController TestController = new controllers.ReverseTestController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTestController TestController = new controllers.javascript.ReverseTestController(RoutesPrefix.byNamePrefix());
  }

}
