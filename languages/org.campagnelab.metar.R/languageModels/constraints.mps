<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:bbac9b32-ad23-4a73-9931-fe439dd26b5d(org.campagnelab.metar.R.constraints)">
  <persistence version="9" />
  <languages>
    <use id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="6q58" ref="r:97268463-8a58-42b7-9dc6-fa004b7a4308(org.campagnelab.metar.R.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="69j5" ref="r:cc2fd9c1-53e7-4805-a8bc-a07e69f2147b(org.campagnelab.metar.R.behavior)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1225271369338" name="jetbrains.mps.baseLanguage.structure.IsEmptyOperation" flags="nn" index="17RlXB" />
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="6329021646629104957" name="jetbrains.mps.baseLanguage.structure.TextCommentPart" flags="nn" index="3SKdUq">
        <property id="6329021646629104958" name="text" index="3SKdUp" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="6329021646629175155" name="commentPart" index="3SKWNk" />
      </concept>
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="1202989531578" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild" flags="in" index="nKS2y" />
      <concept id="1202989658459" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode" flags="nn" index="nLn13" />
      <concept id="1147467115080" name="jetbrains.mps.lang.constraints.structure.NodePropertyConstraint" flags="ng" index="EnEH3">
        <reference id="1147467295099" name="applicableProperty" index="EomxK" />
        <child id="1212097481299" name="propertyValidator" index="QCWH9" />
      </concept>
      <concept id="1147468365020" name="jetbrains.mps.lang.constraints.structure.ConstraintsFunctionParameter_node" flags="nn" index="EsrRn" />
      <concept id="1212096972063" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_PropertyValidator" flags="in" index="QB0g5" />
      <concept id="8401916545537438642" name="jetbrains.mps.lang.constraints.structure.InheritedNodeScopeFactory" flags="ng" index="1dDu$B">
        <reference id="8401916545537438643" name="kind" index="1dDu$A" />
      </concept>
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="1213098023997" name="property" index="1MhHOB" />
        <child id="1213100494875" name="referent" index="1Mr941" />
        <child id="1213106463729" name="canBeChild" index="1MLUbF" />
      </concept>
      <concept id="1148687176410" name="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" flags="ng" index="1N5Pfh">
        <reference id="1148687202698" name="applicableLink" index="1N5Vy1" />
        <child id="1148687345559" name="searchScopeFactory" index="1N6uqs" />
      </concept>
      <concept id="1153138554286" name="jetbrains.mps.lang.constraints.structure.ConstraintsFunctionParameter_propertyValue" flags="nn" index="1Wqviy" />
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="7453996997717780434" name="jetbrains.mps.lang.smodel.structure.Node_GetSConceptOperation" flags="nn" index="2yIwOk" />
      <concept id="1171305280644" name="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" flags="nn" index="2Rf3mk" />
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="1172008320231" name="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" flags="nn" index="3x8VRR" />
      <concept id="1144100932627" name="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion" flags="ng" index="1xIGOp" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1176501494711" name="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" flags="nn" index="3GX2aA" />
    </language>
  </registry>
  <node concept="1M2fIO" id="1_qnSjm5O3O">
    <ref role="1M2myG" to="6q58:5qM9mr9JOd5" resolve="BinaryOperatorExpr" />
  </node>
  <node concept="1M2fIO" id="48xyd$eS3e1">
    <ref role="1M2myG" to="6q58:5mPDeVwiPaR" resolve="Identifier" />
    <node concept="EnEH3" id="1mrtuWrIHho" role="1MhHOB">
      <ref role="EomxK" to="tpck:h0TrG11" resolve="name" />
      <node concept="QB0g5" id="1mrtuWrIHhw" role="QCWH9">
        <node concept="3clFbS" id="1mrtuWrIHhx" role="2VODD2">
          <node concept="3cpWs6" id="7mKjXEiE9SD" role="3cqZAp">
            <node concept="22lmx$" id="7mKjXEiEcNO" role="3cqZAk">
              <node concept="2OqwBi" id="7mKjXEiEaWd" role="3uHU7B">
                <node concept="2OqwBi" id="4ner_7F4weO" role="2Oq$k0">
                  <node concept="EsrRn" id="4ner_7F4vPf" role="2Oq$k0" />
                  <node concept="3TrcHB" id="4ner_7F4EB4" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
                <node concept="17RlXB" id="7mKjXEiEktd" role="2OqNvi" />
              </node>
              <node concept="2OqwBi" id="1mrtuWrNiwi" role="3uHU7w">
                <node concept="35c_gC" id="1mrtuWrNikn" role="2Oq$k0">
                  <ref role="35c_gD" to="6q58:5mPDeVwiPaR" resolve="Identifier" />
                </node>
                <node concept="2qgKlT" id="1mrtuWrNiJt" role="2OqNvi">
                  <ref role="37wK5l" to="69j5:1mrtuWrNhRP" resolve="isValidName" />
                  <node concept="1Wqviy" id="1mrtuWrNiPy" role="37wK5m" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="2HxQOBZmqwz">
    <ref role="1M2myG" to="6q58:50lwYX0Qjq3" resolve="ParameterValue" />
    <node concept="nKS2y" id="2HxQOBZmqwI" role="1MLUbF">
      <node concept="3clFbS" id="2HxQOBZmqwJ" role="2VODD2">
        <node concept="3clFbF" id="2HxQOBZmtOg" role="3cqZAp">
          <node concept="2OqwBi" id="2HxQOBZmunz" role="3clFbG">
            <node concept="2OqwBi" id="2HxQOBZmtU$" role="2Oq$k0">
              <node concept="nLn13" id="2HxQOBZmtOe" role="2Oq$k0" />
              <node concept="2Xjw5R" id="2HxQOBZmub1" role="2OqNvi">
                <node concept="1xMEDy" id="2HxQOBZmub3" role="1xVPHs">
                  <node concept="chp4Y" id="2HxQOBZmugW" role="ri$Ld">
                    <ref role="cht4Q" to="6q58:50lwYX0QjgJ" resolve="ParameterValues" />
                  </node>
                </node>
                <node concept="1xIGOp" id="2HxQOBZmw$L" role="1xVPHs" />
              </node>
            </node>
            <node concept="3x8VRR" id="2HxQOBZmuFx" role="2OqNvi" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="3V2IUSs4U5W">
    <ref role="1M2myG" to="6q58:4hQfa_ZrvSn" resolve="VarargsParameterValue" />
    <node concept="nKS2y" id="3V2IUSs4U6j" role="1MLUbF">
      <node concept="3clFbS" id="3V2IUSs4U6k" role="2VODD2">
        <node concept="3SKdUt" id="3V2IUSs4VdA" role="3cqZAp">
          <node concept="3SKdUq" id="3V2IUSs4Vgw" role="3SKWNk">
            <property role="3SKdUp" value="varargs can be used only inside function declarations which include the ... parameter" />
          </node>
        </node>
        <node concept="3clFbF" id="3V2IUSs4Ube" role="3cqZAp">
          <node concept="2OqwBi" id="3V2IUSs4Wt9" role="3clFbG">
            <node concept="2OqwBi" id="3V2IUSs4UEZ" role="2Oq$k0">
              <node concept="2OqwBi" id="3V2IUSs4UeL" role="2Oq$k0">
                <node concept="nLn13" id="3V2IUSs4Ubd" role="2Oq$k0" />
                <node concept="2Xjw5R" id="3V2IUSs4UuH" role="2OqNvi">
                  <node concept="1xMEDy" id="3V2IUSs4UuJ" role="1xVPHs">
                    <node concept="chp4Y" id="3V2IUSs4U$0" role="ri$Ld">
                      <ref role="cht4Q" to="6q58:5mPDeVwiPaF" resolve="FunctionDeclarationExpr" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2Rf3mk" id="3V2IUSs4VAQ" role="2OqNvi">
                <node concept="1xMEDy" id="3V2IUSs4VAS" role="1xVPHs">
                  <node concept="chp4Y" id="3V2IUSs4VMh" role="ri$Ld">
                    <ref role="cht4Q" to="6q58:4aoS_ZgJfMy" resolve="VarargsParameter" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3GX2aA" id="3V2IUSs4ZBv" role="2OqNvi" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="3jxRpTz2zB$">
    <property role="3GE5qa" value="functions" />
    <ref role="1M2myG" to="6q58:4aoS_ZgJfMu" resolve="ParameterDeclaration" />
    <node concept="nKS2y" id="3jxRpTz2zCi" role="1MLUbF">
      <node concept="3clFbS" id="3jxRpTz2zCj" role="2VODD2">
        <node concept="3clFbF" id="3jxRpTz2zKz" role="3cqZAp">
          <node concept="3clFbC" id="3jxRpTz2$at" role="3clFbG">
            <node concept="35c_gC" id="3jxRpTz2$fW" role="3uHU7w">
              <ref role="35c_gD" to="6q58:4aoS_ZgJfMv" resolve="FunctionParamDeclarationList" />
            </node>
            <node concept="2OqwBi" id="3jxRpTz2zO8" role="3uHU7B">
              <node concept="nLn13" id="3jxRpTz2zKy" role="2Oq$k0" />
              <node concept="2yIwOk" id="3jxRpTz2$1D" role="2OqNvi" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="3jxRpTz79Kx">
    <ref role="1M2myG" to="6q58:1jge5x__XE8" resolve="IdentifierRef" />
    <node concept="1N5Pfh" id="3jxRpTz79Ky" role="1Mr941">
      <ref role="1N5Vy1" to="6q58:1jge5x_A4_z" />
      <node concept="1dDu$B" id="3jxRpTz79KA" role="1N6uqs">
        <ref role="1dDu$A" to="6q58:5mPDeVwiPaR" resolve="Identifier" />
      </node>
    </node>
  </node>
</model>

