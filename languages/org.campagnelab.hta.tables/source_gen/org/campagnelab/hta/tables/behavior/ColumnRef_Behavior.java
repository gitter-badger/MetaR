package org.campagnelab.hta.tables.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ColumnRef_Behavior {
  public static void init(SNode thisNode) {
  }

  public static String call_getCleanColumnName_2807244893512039175(SNode thisNode) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "col", false), "name").replaceAll("[^a-zA-Z0-9]", "_");
  }
}
