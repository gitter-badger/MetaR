package org.campagnelab.metar.edgeR.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.BinaryExpression").super_("org.campagnelab.metar.edgeR.structure.GroupExpression").parents("org.campagnelab.metar.edgeR.structure.GroupExpression").children(new String[]{"left", "right"}, new boolean[]{false, false}).abstract_().create();
      case 1:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.CommonDispersion").super_("org.campagnelab.metar.edgeR.structure.DispersionMethod").parents("org.campagnelab.metar.edgeR.structure.DispersionMethod").alias("common dispersion", "Common (across genes) dispersion estimation").create();
      case 2:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.DispersionMethod").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").abstract_().create();
      case 3:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.EdgeRTest").super_("org.campagnelab.metar.tables.structure.Statement").parents("org.campagnelab.metar.tables.structure.Statement").children(new String[]{"countsTable", "modelFormula", "contrasts", "destinationTable", "dispersionMethod"}, new boolean[]{false, false, false, false, false}).alias("edgeR", "").create();
      case 4:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.GroupExpression").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").abstract_().create();
      case 5:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.GroupFormula").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").children(new String[]{"groupExpression"}, new boolean[]{false}).alias("~", "").create();
      case 6:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.GroupUsageRef").super_("org.campagnelab.metar.edgeR.structure.GroupExpression").parents("org.campagnelab.metar.edgeR.structure.GroupExpression").references("groupUsage").create();
      case 7:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.Minus").super_("org.campagnelab.metar.edgeR.structure.BinaryExpression").parents("org.campagnelab.metar.edgeR.structure.BinaryExpression").alias("-", "").create();
      case 8:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.NoIntercept").super_("org.campagnelab.metar.edgeR.structure.GroupExpression").parents("org.campagnelab.metar.edgeR.structure.GroupExpression").alias("no intercept", "").create();
      case 9:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.Plus").super_("org.campagnelab.metar.edgeR.structure.BinaryExpression").parents("org.campagnelab.metar.edgeR.structure.BinaryExpression").alias("+", "").create();
      case 10:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.TagWiseDispersion").super_("org.campagnelab.metar.edgeR.structure.DispersionMethod").parents("org.campagnelab.metar.edgeR.structure.DispersionMethod").alias("tagwise dispersion", "Tagwise (gene-level) dispersion estimation").create();
      case 11:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.Times").super_("org.campagnelab.metar.edgeR.structure.BinaryExpression").parents("org.campagnelab.metar.edgeR.structure.BinaryExpression").alias("*", "").create();
      case 12:
        return new ConceptDescriptorBuilder("org.campagnelab.metar.edgeR.structure.TrendedDispersion").super_("org.campagnelab.metar.edgeR.structure.DispersionMethod").parents("org.campagnelab.metar.edgeR.structure.DispersionMethod").alias("trended dispersion", "Estimate dispersion with possible abundance trend").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"org.campagnelab.metar.edgeR.structure.BinaryExpression", "org.campagnelab.metar.edgeR.structure.CommonDispersion", "org.campagnelab.metar.edgeR.structure.DispersionMethod", "org.campagnelab.metar.edgeR.structure.EdgeRTest", "org.campagnelab.metar.edgeR.structure.GroupExpression", "org.campagnelab.metar.edgeR.structure.GroupFormula", "org.campagnelab.metar.edgeR.structure.GroupUsageRef", "org.campagnelab.metar.edgeR.structure.Minus", "org.campagnelab.metar.edgeR.structure.NoIntercept", "org.campagnelab.metar.edgeR.structure.Plus", "org.campagnelab.metar.edgeR.structure.TagWiseDispersion", "org.campagnelab.metar.edgeR.structure.Times", "org.campagnelab.metar.edgeR.structure.TrendedDispersion"};
}
