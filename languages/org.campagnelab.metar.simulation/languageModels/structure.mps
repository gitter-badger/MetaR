<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:35e57e46-a34e-4190-bb18-c2596691e768(org.campagnelab.metar.simulation.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="jrxw" ref="r:9f2bbfbf-f8b7-4b3b-92b1-b6a0e9642c10(org.campagnelab.metar.tables.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="4628067390765956807" name="final" index="R5$K2" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <property id="1587916991969465369" name="conceptId" index="1pbfSe" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="2734ievAyTY">
    <property role="TrG5h" value="SimulateDataset" />
    <property role="34LRSv" value="simulate dataset" />
    <property role="1pbfSe" value="1050853471" />
    <ref role="1TJDcQ" to="jrxw:5Wt7RzzuILp" resolve="DataTableStatement" />
    <node concept="1TJgyj" id="2734ievAQvk" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="discreteFactors" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="2734ievAOED" resolve="DiscreteFactor" />
    </node>
    <node concept="1TJgyj" id="2734ievAQvm" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="continuousCovariate" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="2734ievAQvI" resolve="CovariateFactor" />
    </node>
    <node concept="1TJgyj" id="7$n2ViPrFPR" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="simulationTable" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" to="jrxw:2WRhvFto5F5" resolve="FutureTable" />
    </node>
    <node concept="1TJgyj" id="2734ievAS6k" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="covariateTableRef" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="oeXtRXmVOQ" resolve="CovariateTableRef" />
    </node>
    <node concept="1TJgyj" id="7hF4JJ2RXF0" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="samples" />
      <property role="20lbJX" value="0..1" />
      <ref role="20lvS9" node="7hF4JJ2RXry" resolve="SampleNames" />
    </node>
    <node concept="1TJgyi" id="2734ievAOBA" role="1TKVEl">
      <property role="TrG5h" value="numOfSamples" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2734ievAOCC" role="1TKVEl">
      <property role="TrG5h" value="numOfGenes" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="7hF4JJ2PPka" role="1TKVEl">
      <property role="TrG5h" value="mean" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="4lfKH_Jefvc" role="1TKVEl">
      <property role="TrG5h" value="effect_size" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="PrWs8" id="2734ievAyU2" role="PzmwI">
      <ref role="PrY4T" to="jrxw:5iYlRBKtkRE" resolve="FutureTableCreator" />
    </node>
  </node>
  <node concept="1TIwiD" id="2734ievAOED">
    <property role="TrG5h" value="DiscreteFactor" />
    <property role="1pbfSe" value="1050780724" />
    <ref role="1TJDcQ" node="2734ievAQvF" resolve="Factor" />
    <node concept="1TJgyi" id="7hF4JJ2OOEk" role="1TKVEl">
      <property role="TrG5h" value="percentageOfAffectedGenes" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="7hF4JJ2OOED" role="1TKVEl">
      <property role="TrG5h" value="percentageOfTreatedSamples" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="PrWs8" id="2734ievAOEE" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2734ievAQvF">
    <property role="TrG5h" value="Factor" />
    <property role="R5$K7" value="true" />
    <property role="R5$K2" value="false" />
    <property role="1pbfSe" value="1050773234" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="2734ievAQvG" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="2734ievAQvI">
    <property role="TrG5h" value="CovariateFactor" />
    <property role="1pbfSe" value="1050773231" />
    <ref role="1TJDcQ" node="2734ievAQvF" resolve="Factor" />
    <node concept="1TJgyi" id="2734ievCkLH" role="1TKVEl">
      <property role="TrG5h" value="lower_limit" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="2734ievCkLI" role="1TKVEl">
      <property role="TrG5h" value="upper_limit" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="4lfKH_INH5L" role="1TKVEl">
      <property role="TrG5h" value="linear_slope" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
  </node>
  <node concept="1TIwiD" id="7hF4JJ2JZdy">
    <property role="TrG5h" value="StringValue" />
    <property role="1pbfSe" value="925566557" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="7hF4JJ2JZot" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7hF4JJ2RXry">
    <property role="TrG5h" value="SampleNames" />
    <property role="1pbfSe" value="927656413" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="7hF4JJ2RXEB" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="sampleNames" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="4CUtYZMZzi" resolve="SampleName" />
    </node>
  </node>
  <node concept="1TIwiD" id="4CUtYZMZzi">
    <property role="TrG5h" value="SampleName" />
    <property role="1pbfSe" value="1057693007" />
    <node concept="1TJgyj" id="4CUtYZMZzJ" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="treatments" />
      <property role="20lbJX" value="0..n" />
      <ref role="20lvS9" node="7hF4JJ2JZdy" resolve="StringValue" />
    </node>
    <node concept="PrWs8" id="4CUtYZMZzH" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="WAEVbt3F3q">
    <property role="TrG5h" value="CovariateTable" />
    <property role="19KtqR" value="true" />
    <property role="1pbfSe" value="332047220" />
    <ref role="1TJDcQ" to="jrxw:2WRhvFtkykN" resolve="Table" />
  </node>
  <node concept="1TIwiD" id="oeXtRXmVOQ">
    <property role="TrG5h" value="CovariateTableRef" />
    <property role="1pbfSe" value="57324307" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="oeXtRXnOb3" role="1TKVEi">
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="table" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="WAEVbt3F3q" resolve="CovariateTable" />
    </node>
  </node>
</model>

