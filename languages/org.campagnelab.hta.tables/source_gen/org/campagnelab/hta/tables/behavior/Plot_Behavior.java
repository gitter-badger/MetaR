package org.campagnelab.hta.tables.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.io.File;

public class Plot_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getPath_8016431400518331231(SNode thisNode) {
    if (SPropertyOperations.getString(thisNode, "path") == null) {
      SPropertyOperations.set(thisNode, "path", new File("plot-" + SPropertyOperations.getString(thisNode, "name") + ".png").getAbsolutePath());
    }
    return SPropertyOperations.getString(thisNode, "path");
  }
}