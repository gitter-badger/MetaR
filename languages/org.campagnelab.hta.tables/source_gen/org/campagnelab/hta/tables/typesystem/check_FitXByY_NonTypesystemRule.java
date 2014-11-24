package org.campagnelab.hta.tables.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.messageTargets.ReferenceMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_FitXByY_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_FitXByY_NonTypesystemRule() {
  }

  public void applyRule(final SNode fitXByY, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (SNodeOperations.getContainingRoot(SLinkOperations.getTarget(fitXByY, "x", false)) != SNodeOperations.getContainingRoot(SLinkOperations.getTarget(fitXByY, "y", false))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        errorTarget = new ReferenceMessageTarget("y");
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(fitXByY, "x and y columns must be from the same table", "r:ccfe7aab-49c3-4336-8a96-a894ec9d0e17(org.campagnelab.hta.tables.typesystem)", "2807244893515931967", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "org.campagnelab.hta.tables.structure.FitXByY";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConcept().getQualifiedName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
