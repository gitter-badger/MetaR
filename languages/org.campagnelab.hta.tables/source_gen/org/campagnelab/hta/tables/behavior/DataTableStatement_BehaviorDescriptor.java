package org.campagnelab.hta.tables.behavior;

/*Generated by MPS */

import org.campagnelab.hta.script.behavior.Statement_BehaviorDescriptor;
import org.campagnelab.hta.script.behavior.StatementDependencies_BehaviorDescriptor;
import org.jetbrains.mps.openapi.model.SNode;

public abstract class DataTableStatement_BehaviorDescriptor extends Statement_BehaviorDescriptor implements StatementDependencies_BehaviorDescriptor {
  public DataTableStatement_BehaviorDescriptor() {
  }

  public Iterable<String> virtual_dependencies_6853668812000956111(SNode thisNode) {
    return DataTableStatement_Behavior.virtual_dependencies_6853668812000956111(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "org.campagnelab.hta.tables.structure.DataTableStatement";
  }
}
