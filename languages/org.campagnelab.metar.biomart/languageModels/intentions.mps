<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:c8beec1b-f506-40f9-8513-a7103ec80954(org.campagnelab.metar.biomart.intentions)">
  <persistence version="9" />
  <languages>
    <use id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions" version="-1" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="okqk" ref="r:a8c6f275-63e6-4f3f-a0b9-9dfd9b95fe4b(org.campagnelab.metar.biomart.behavior)" />
    <import index="c07g" ref="r:1ddbf3ba-cbe7-4cb8-b2fc-7a1e80a63d10(org.campagnelab.metar.biomart.structure)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1239714755177" name="jetbrains.mps.baseLanguage.structure.AbstractUnaryNumberOperation" flags="nn" index="2$Kvd9">
        <child id="1239714902950" name="expression" index="2$L3a6" />
      </concept>
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1081506773034" name="jetbrains.mps.baseLanguage.structure.LessThanExpression" flags="nn" index="3eOVzh" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1214918800624" name="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" flags="nn" index="3uNrnE" />
      <concept id="1144230876926" name="jetbrains.mps.baseLanguage.structure.AbstractForStatement" flags="nn" index="1DupvO">
        <child id="1144230900587" name="variable" index="1Duv9x" />
      </concept>
      <concept id="1144231330558" name="jetbrains.mps.baseLanguage.structure.ForStatement" flags="nn" index="1Dw8fO">
        <child id="1144231399730" name="condition" index="1Dwp0S" />
        <child id="1144231408325" name="iteration" index="1Dwrff" />
      </concept>
      <concept id="6329021646629104957" name="jetbrains.mps.baseLanguage.structure.TextCommentPart" flags="nn" index="3SKdUq">
        <property id="6329021646629104958" name="text" index="3SKdUp" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="6329021646629175155" name="commentPart" index="3SKWNk" />
      </concept>
      <concept id="6329021646629175143" name="jetbrains.mps.baseLanguage.structure.StatementCommentPart" flags="nn" index="3SKWN0">
        <child id="6329021646629175144" name="commentedStatement" index="3SKWNf" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions">
      <concept id="1192794744107" name="jetbrains.mps.lang.intentions.structure.IntentionDeclaration" flags="ig" index="2S6QgY" />
      <concept id="1192794782375" name="jetbrains.mps.lang.intentions.structure.DescriptionBlock" flags="in" index="2S6ZIM" />
      <concept id="1192795911897" name="jetbrains.mps.lang.intentions.structure.ExecuteBlock" flags="in" index="2Sbjvc" />
      <concept id="1192796902958" name="jetbrains.mps.lang.intentions.structure.ConceptFunctionParameter_node" flags="nn" index="2Sf5sV" />
      <concept id="2522969319638091381" name="jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration" flags="ig" index="2ZfUlf">
        <property id="2522969319638091386" name="isAvailableInChildNodes" index="2ZfUl0" />
        <reference id="2522969319638198290" name="forConcept" index="2ZfgGC" />
        <child id="2522969319638198291" name="executeFunction" index="2ZfgGD" />
        <child id="2522969319638093993" name="descriptionFunction" index="2ZfVej" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="1145383075378" name="jetbrains.mps.lang.smodel.structure.SNodeListType" flags="in" index="2I9FWS">
        <reference id="1145383142433" name="elementConcept" index="2I9WkF" />
      </concept>
      <concept id="1171305280644" name="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" flags="nn" index="2Rf3mk" />
      <concept id="1171310072040" name="jetbrains.mps.lang.smodel.structure.Node_GetContainingRootOperation" flags="nn" index="2Rxl7S" />
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1146253292180" name="jetbrains.mps.lang.smodel.structure.Property_HasValue_Simple" flags="nn" index="3y1jeu">
        <child id="1146253292181" name="value" index="3y1jev" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1151688443754" name="jetbrains.mps.baseLanguage.collections.structure.ListType" flags="in" index="_YKpA">
        <child id="1151688676805" name="elementType" index="_ZDj9" />
      </concept>
      <concept id="1153943597977" name="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" flags="nn" index="2Gpval">
        <child id="1153944400369" name="variable" index="2Gsz3X" />
        <child id="1153944424730" name="inputSequence" index="2GsD0m" />
      </concept>
      <concept id="1153944193378" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" flags="nr" index="2GrKxI" />
      <concept id="1153944233411" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" flags="nn" index="2GrUjf">
        <reference id="1153944258490" name="variable" index="2Gs0qQ" />
      </concept>
      <concept id="1237721394592" name="jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator" flags="nn" index="HWqM0">
        <child id="1237721435807" name="elementType" index="HW$YZ" />
      </concept>
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1160600644654" name="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" flags="nn" index="Tc6Ow" />
      <concept id="1160612413312" name="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" flags="nn" index="TSZUe" />
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
      <concept id="1165530316231" name="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" flags="nn" index="1v1jN8" />
      <concept id="1225711141656" name="jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression" flags="nn" index="1y4W85">
        <child id="1225711182005" name="list" index="1y566C" />
        <child id="1225711191269" name="index" index="1y58nS" />
      </concept>
      <concept id="1225727723840" name="jetbrains.mps.baseLanguage.collections.structure.FindFirstOperation" flags="nn" index="1z4cxt" />
    </language>
  </registry>
  <node concept="2S6QgY" id="KwXu1XcJ8$">
    <property role="3GE5qa" value="main" />
    <property role="TrG5h" value="RefreshRegistry" />
    <property role="2ZfUl0" value="true" />
    <ref role="2ZfgGC" to="c07g:3k98b1qdWzt" resolve="Biomart" />
    <node concept="2Sbjvc" id="KwXu1XcJ8_" role="2ZfgGD">
      <node concept="3clFbS" id="KwXu1XcJ8A" role="2VODD2">
        <node concept="3SKdUt" id="1UH1ei3ZRJf" role="3cqZAp">
          <node concept="3SKdUq" id="1UH1ei3ZRYz" role="3SKWNk">
            <property role="3SKdUp" value=" make a loop around each biomart node and repopulate each statement to make it better" />
          </node>
        </node>
        <node concept="3SKdUt" id="KwXu1XmT4e" role="3cqZAp">
          <node concept="3SKdUq" id="KwXu1XmTiv" role="3SKWNk">
            <property role="3SKdUp" value="if a Database an a dataset are define keep this information inside the Statement" />
          </node>
        </node>
        <node concept="3cpWs8" id="1UH1ei6CuCu" role="3cqZAp">
          <node concept="3cpWsn" id="1UH1ei6CuCx" role="3cpWs9">
            <property role="TrG5h" value="listOfQuery" />
            <node concept="2I9FWS" id="1UH1ei6CuQC" role="1tU5fm">
              <ref role="2I9WkF" to="c07g:3k98b1qdWzt" resolve="Biomart" />
            </node>
            <node concept="2OqwBi" id="1UH1ei6CviG" role="33vP2m">
              <node concept="2OqwBi" id="1UH1ei6Cv06" role="2Oq$k0">
                <node concept="2Rxl7S" id="Uo9xLnkCba" role="2OqNvi" />
                <node concept="2Sf5sV" id="1UH1ei6CuWW" role="2Oq$k0" />
              </node>
              <node concept="2Rf3mk" id="1UH1ei6CvDF" role="2OqNvi">
                <node concept="1xMEDy" id="1UH1ei6CvDH" role="1xVPHs">
                  <node concept="chp4Y" id="1UH1ei6CvFb" role="ri$Ld">
                    <ref role="cht4Q" to="c07g:3k98b1qdWzt" resolve="Biomart" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="1UH1ei6CvGQ" role="3cqZAp" />
        <node concept="3SKdUt" id="1UH1ei6C$nR" role="3cqZAp">
          <node concept="3SKdUq" id="1UH1ei6C$G3" role="3SKWNk">
            <property role="3SKdUp" value="save the database dataset attributes and filters martname" />
          </node>
        </node>
        <node concept="3cpWs8" id="1UH1ei6C_W5" role="3cqZAp">
          <node concept="3cpWsn" id="1UH1ei6C_W8" role="3cpWs9">
            <property role="TrG5h" value="databaseMartName" />
            <node concept="_YKpA" id="1UH1ei6C_W1" role="1tU5fm">
              <node concept="17QB3L" id="1UH1ei6CAgu" role="_ZDj9" />
            </node>
            <node concept="2ShNRf" id="1UH1ei6CAsw" role="33vP2m">
              <node concept="Tc6Ow" id="1UH1ei6CAiJ" role="2ShVmc">
                <node concept="17QB3L" id="1UH1ei6CAiK" role="HW$YZ" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="1UH1ei6CAGm" role="3cqZAp">
          <node concept="3cpWsn" id="1UH1ei6CAGn" role="3cpWs9">
            <property role="TrG5h" value="datasetMartName" />
            <node concept="_YKpA" id="1UH1ei6CAGo" role="1tU5fm">
              <node concept="17QB3L" id="1UH1ei6CAGp" role="_ZDj9" />
            </node>
            <node concept="2ShNRf" id="1UH1ei6CAGq" role="33vP2m">
              <node concept="Tc6Ow" id="1UH1ei6CAGr" role="2ShVmc">
                <node concept="17QB3L" id="1UH1ei6CAGs" role="HW$YZ" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3SKdUt" id="1UH1ei6CBA5" role="3cqZAp">
          <node concept="3SKWN0" id="1UH1ei6CBAd" role="3SKWNk">
            <node concept="3cpWs8" id="1UH1ei6CBb5" role="3SKWNf">
              <node concept="3cpWsn" id="1UH1ei6CBb6" role="3cpWs9">
                <property role="TrG5h" value="databaseMartName" />
                <node concept="_YKpA" id="1UH1ei6CBb7" role="1tU5fm">
                  <node concept="17QB3L" id="1UH1ei6CBb8" role="_ZDj9" />
                </node>
                <node concept="2ShNRf" id="1UH1ei6CBb9" role="33vP2m">
                  <node concept="Tc6Ow" id="1UH1ei6CBba" role="2ShVmc">
                    <node concept="17QB3L" id="1UH1ei6CBbb" role="HW$YZ" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="1UH1ei6CAVM" role="3cqZAp" />
        <node concept="3clFbH" id="1UH1ei6CAtb" role="3cqZAp" />
        <node concept="2Gpval" id="1UH1ei6Cwkp" role="3cqZAp">
          <node concept="2GrKxI" id="1UH1ei6Cwkr" role="2Gsz3X">
            <property role="TrG5h" value="query" />
          </node>
          <node concept="3clFbS" id="1UH1ei6Cwkt" role="2LFqv$">
            <node concept="3SKdUt" id="KwXu1XmW16" role="3cqZAp">
              <node concept="3SKdUq" id="KwXu1XmWc3" role="3SKWNk">
                <property role="3SKdUp" value="Keep the mart name" />
              </node>
            </node>
            <node concept="3clFbF" id="1UH1ei6CCli" role="3cqZAp">
              <node concept="2OqwBi" id="1UH1ei6CCKl" role="3clFbG">
                <node concept="37vLTw" id="1UH1ei6CClg" role="2Oq$k0">
                  <ref role="3cqZAo" node="1UH1ei6C_W8" resolve="databaseMartName" />
                </node>
                <node concept="TSZUe" id="1UH1ei6CEgr" role="2OqNvi">
                  <node concept="2OqwBi" id="1UH1ei6CFBl" role="25WWJ7">
                    <node concept="2OqwBi" id="1UH1ei6CEqK" role="2Oq$k0">
                      <node concept="2GrUjf" id="1UH1ei6CEk4" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="1UH1ei6Cwkr" resolve="query" />
                      </node>
                      <node concept="3TrEf2" id="1UH1ei6CEZw" role="2OqNvi">
                        <ref role="3Tt5mk" to="c07g:KwXu1WjUL4" />
                      </node>
                    </node>
                    <node concept="3TrcHB" id="1UH1ei6CG6c" role="2OqNvi">
                      <ref role="3TsBF5" to="c07g:KwXu1W4Zk_" resolve="martName" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="1UH1ei6CGyj" role="3cqZAp">
              <node concept="2OqwBi" id="1UH1ei6CGyk" role="3clFbG">
                <node concept="37vLTw" id="1UH1ei6CGPP" role="2Oq$k0">
                  <ref role="3cqZAo" node="1UH1ei6CAGn" resolve="datasetMartName" />
                </node>
                <node concept="TSZUe" id="1UH1ei6CGym" role="2OqNvi">
                  <node concept="2OqwBi" id="1UH1ei6CGyn" role="25WWJ7">
                    <node concept="2OqwBi" id="1UH1ei6CGyo" role="2Oq$k0">
                      <node concept="2GrUjf" id="1UH1ei6CGyp" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="1UH1ei6Cwkr" resolve="query" />
                      </node>
                      <node concept="3TrEf2" id="1UH1ei6CHdX" role="2OqNvi">
                        <ref role="3Tt5mk" to="c07g:KwXu1X1JZ9" />
                      </node>
                    </node>
                    <node concept="3TrcHB" id="1UH1ei6CGyr" role="2OqNvi">
                      <ref role="3TsBF5" to="c07g:KwXu1W4Zk_" resolve="martName" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="1UH1ei6CGpZ" role="3cqZAp" />
            <node concept="3clFbH" id="KwXu1XoRsh" role="3cqZAp" />
          </node>
          <node concept="37vLTw" id="1UH1ei6CwM1" role="2GsD0m">
            <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
          </node>
        </node>
        <node concept="3clFbH" id="1UH1ei6DdnO" role="3cqZAp" />
        <node concept="3clFbF" id="Uo9xLnkxI2" role="3cqZAp">
          <node concept="2OqwBi" id="Uo9xLnkyhz" role="3clFbG">
            <node concept="35c_gC" id="Uo9xLnkxI0" role="2Oq$k0">
              <ref role="35c_gD" to="c07g:3k98b1qdWzt" resolve="Biomart" />
            </node>
            <node concept="2qgKlT" id="Uo9xLnkB0Q" role="2OqNvi">
              <ref role="37wK5l" to="okqk:Uo9xLnjN4e" resolve="deleteMartRegistry" />
              <node concept="2Sf5sV" id="Uo9xLnkCs2" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="Uo9xLnkCSx" role="3cqZAp">
          <node concept="2OqwBi" id="Uo9xLnkCSy" role="3clFbG">
            <node concept="35c_gC" id="Uo9xLnkCSz" role="2Oq$k0">
              <ref role="35c_gD" to="c07g:3k98b1qdWzt" resolve="Biomart" />
            </node>
            <node concept="2qgKlT" id="Uo9xLnkCS$" role="2OqNvi">
              <ref role="37wK5l" to="okqk:Uo9xLniBVx" resolve="createMartRegistry" />
              <node concept="2Sf5sV" id="Uo9xLnkCS_" role="37wK5m" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="Uo9xLnkCu1" role="3cqZAp" />
        <node concept="1Dw8fO" id="1UH1ei6CUaU" role="3cqZAp">
          <node concept="3clFbS" id="1UH1ei6CUaW" role="2LFqv$">
            <node concept="3clFbF" id="1UH1ei6Dg1z" role="3cqZAp">
              <node concept="37vLTI" id="1UH1ei6Diu3" role="3clFbG">
                <node concept="2OqwBi" id="1UH1ei6Dk5z" role="37vLTx">
                  <node concept="2OqwBi" id="1UH1ei6Dk5$" role="2Oq$k0">
                    <node concept="2OqwBi" id="Uo9xLniMfG" role="2Oq$k0">
                      <node concept="35c_gC" id="Uo9xLniMfH" role="2Oq$k0">
                        <ref role="35c_gD" to="c07g:3k98b1qdWzt" resolve="Biomart" />
                      </node>
                      <node concept="2qgKlT" id="Uo9xLniMfI" role="2OqNvi">
                        <ref role="37wK5l" to="okqk:Uo9xLnioTN" resolve="getMartRegistry" />
                        <node concept="2Sf5sV" id="Uo9xLnkDn6" role="37wK5m" />
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="1UH1ei6Dk5H" role="2OqNvi">
                      <ref role="3TtcxE" to="c07g:6Om6Mbm3Tzy" />
                    </node>
                  </node>
                  <node concept="1z4cxt" id="1UH1ei6Dk5I" role="2OqNvi">
                    <node concept="1bVj0M" id="1UH1ei6Dk5J" role="23t8la">
                      <node concept="3clFbS" id="1UH1ei6Dk5K" role="1bW5cS">
                        <node concept="3clFbF" id="1UH1ei6Dk5L" role="3cqZAp">
                          <node concept="2OqwBi" id="1UH1ei6Dk5M" role="3clFbG">
                            <node concept="2OqwBi" id="1UH1ei6Dk5N" role="2Oq$k0">
                              <node concept="37vLTw" id="1UH1ei6Dk5O" role="2Oq$k0">
                                <ref role="3cqZAo" node="1UH1ei6Dk5S" resolve="it" />
                              </node>
                              <node concept="3TrcHB" id="1UH1ei6Dk5P" role="2OqNvi">
                                <ref role="3TsBF5" to="c07g:KwXu1W4Zk_" resolve="martName" />
                              </node>
                            </node>
                            <node concept="3y1jeu" id="1UH1ei6Dk5Q" role="2OqNvi">
                              <node concept="1y4W85" id="1UH1ei6DkGb" role="3y1jev">
                                <node concept="37vLTw" id="1UH1ei6DkL0" role="1y58nS">
                                  <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                                </node>
                                <node concept="37vLTw" id="1UH1ei6Dkl6" role="1y566C">
                                  <ref role="3cqZAo" node="1UH1ei6C_W8" resolve="databaseMartName" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="1UH1ei6Dk5S" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="1UH1ei6Dk5T" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="2OqwBi" id="1UH1ei6DgST" role="37vLTJ">
                  <node concept="1y4W85" id="1UH1ei6DgOS" role="2Oq$k0">
                    <node concept="37vLTw" id="1UH1ei6DgQ1" role="1y58nS">
                      <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                    </node>
                    <node concept="37vLTw" id="1UH1ei6Dg1y" role="1y566C">
                      <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                    </node>
                  </node>
                  <node concept="3TrEf2" id="1UH1ei6Dha2" role="2OqNvi">
                    <ref role="3Tt5mk" to="c07g:KwXu1WjUL4" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="1UH1ei6FlC1" role="3cqZAp">
              <node concept="3clFbS" id="1UH1ei6FlC3" role="3clFbx">
                <node concept="3clFbF" id="1UH1ei6Dm6N" role="3cqZAp">
                  <node concept="2OqwBi" id="1UH1ei6Dm6O" role="3clFbG">
                    <node concept="2OqwBi" id="1UH1ei6Dm6P" role="2Oq$k0">
                      <node concept="3TrEf2" id="1UH1ei6Dm6R" role="2OqNvi">
                        <ref role="3Tt5mk" to="c07g:KwXu1WjUL4" />
                      </node>
                      <node concept="1y4W85" id="1UH1ei6Dmjb" role="2Oq$k0">
                        <node concept="37vLTw" id="1UH1ei6Dmjc" role="1y58nS">
                          <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                        </node>
                        <node concept="37vLTw" id="1UH1ei6Dmjd" role="1y566C">
                          <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                        </node>
                      </node>
                    </node>
                    <node concept="2qgKlT" id="1UH1ei6Dm6S" role="2OqNvi">
                      <ref role="37wK5l" to="okqk:KwXu1W7RYT" resolve="getDatasetList" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="1UH1ei6FlC2" role="3cqZAp" />
              </node>
              <node concept="2OqwBi" id="1UH1ei6Fnjr" role="3clFbw">
                <node concept="2OqwBi" id="1UH1ei6Fm9P" role="2Oq$k0">
                  <node concept="2OqwBi" id="1UH1ei6FlOQ" role="2Oq$k0">
                    <node concept="3TrEf2" id="1UH1ei6FlOR" role="2OqNvi">
                      <ref role="3Tt5mk" to="c07g:KwXu1WjUL4" />
                    </node>
                    <node concept="1y4W85" id="1UH1ei6FlOS" role="2Oq$k0">
                      <node concept="37vLTw" id="1UH1ei6FlOT" role="1y58nS">
                        <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                      </node>
                      <node concept="37vLTw" id="1UH1ei6FlOU" role="1y566C">
                        <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                      </node>
                    </node>
                  </node>
                  <node concept="3Tsc0h" id="1UH1ei6FmmE" role="2OqNvi">
                    <ref role="3TtcxE" to="c07g:KwXu1W7GU_" />
                  </node>
                </node>
                <node concept="1v1jN8" id="1UH1ei6FoKW" role="2OqNvi" />
              </node>
            </node>
            <node concept="3clFbH" id="1UH1ei6DlXe" role="3cqZAp" />
            <node concept="3clFbF" id="1UH1ei6Dj5f" role="3cqZAp">
              <node concept="37vLTI" id="1UH1ei6Dj5g" role="3clFbG">
                <node concept="2OqwBi" id="1UH1ei6Dj5l" role="37vLTJ">
                  <node concept="1y4W85" id="1UH1ei6Dj5m" role="2Oq$k0">
                    <node concept="37vLTw" id="1UH1ei6Dj5n" role="1y58nS">
                      <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                    </node>
                    <node concept="37vLTw" id="1UH1ei6Dj5o" role="1y566C">
                      <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                    </node>
                  </node>
                  <node concept="3TrEf2" id="1UH1ei6DjuR" role="2OqNvi">
                    <ref role="3Tt5mk" to="c07g:KwXu1X1JZ9" />
                  </node>
                </node>
                <node concept="2OqwBi" id="1UH1ei6Doj4" role="37vLTx">
                  <node concept="2OqwBi" id="1UH1ei6Dn7f" role="2Oq$k0">
                    <node concept="2OqwBi" id="1UH1ei6Dmvi" role="2Oq$k0">
                      <node concept="1y4W85" id="1UH1ei6Dmqm" role="2Oq$k0">
                        <node concept="37vLTw" id="1UH1ei6Dmqn" role="1y58nS">
                          <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                        </node>
                        <node concept="37vLTw" id="1UH1ei6Dmqo" role="1y566C">
                          <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                        </node>
                      </node>
                      <node concept="3TrEf2" id="1UH1ei6DmLP" role="2OqNvi">
                        <ref role="3Tt5mk" to="c07g:KwXu1WjUL4" />
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="1UH1ei6Dnkz" role="2OqNvi">
                      <ref role="3TtcxE" to="c07g:KwXu1W7GU_" />
                    </node>
                  </node>
                  <node concept="1z4cxt" id="1UH1ei6DraW" role="2OqNvi">
                    <node concept="1bVj0M" id="1UH1ei6DraY" role="23t8la">
                      <node concept="3clFbS" id="1UH1ei6DraZ" role="1bW5cS">
                        <node concept="3clFbF" id="1UH1ei6Drfy" role="3cqZAp">
                          <node concept="2OqwBi" id="1UH1ei6DrWh" role="3clFbG">
                            <node concept="2OqwBi" id="1UH1ei6DrjI" role="2Oq$k0">
                              <node concept="37vLTw" id="1UH1ei6Drfx" role="2Oq$k0">
                                <ref role="3cqZAo" node="1UH1ei6Drb0" resolve="it" />
                              </node>
                              <node concept="3TrcHB" id="1UH1ei6Drza" role="2OqNvi">
                                <ref role="3TsBF5" to="c07g:KwXu1W4Zk_" resolve="martName" />
                              </node>
                            </node>
                            <node concept="3y1jeu" id="1UH1ei6Dxdp" role="2OqNvi">
                              <node concept="1y4W85" id="1UH1ei6DxKq" role="3y1jev">
                                <node concept="37vLTw" id="1UH1ei6DxOW" role="1y58nS">
                                  <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                                </node>
                                <node concept="37vLTw" id="1UH1ei6DxpD" role="1y566C">
                                  <ref role="3cqZAo" node="1UH1ei6CAGn" resolve="datasetMartName" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="1UH1ei6Drb0" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="1UH1ei6Drb1" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="1UH1ei6Fpel" role="3cqZAp">
              <node concept="3clFbS" id="1UH1ei6Fpen" role="3clFbx">
                <node concept="3clFbF" id="1UH1ei6DxUz" role="3cqZAp">
                  <node concept="2OqwBi" id="1UH1ei6Dyp0" role="3clFbG">
                    <node concept="2OqwBi" id="1UH1ei6DxU_" role="2Oq$k0">
                      <node concept="1y4W85" id="1UH1ei6DxUA" role="2Oq$k0">
                        <node concept="37vLTw" id="1UH1ei6DxUB" role="1y58nS">
                          <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                        </node>
                        <node concept="37vLTw" id="1UH1ei6DxUC" role="1y566C">
                          <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                        </node>
                      </node>
                      <node concept="3TrEf2" id="1UH1ei6DxUD" role="2OqNvi">
                        <ref role="3Tt5mk" to="c07g:KwXu1X1JZ9" />
                      </node>
                    </node>
                    <node concept="2qgKlT" id="1UH1ei6Dy_M" role="2OqNvi">
                      <ref role="37wK5l" to="okqk:KwXu1W$8hL" resolve="getAttributesList" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="1UH1ei6Fpem" role="3cqZAp" />
              </node>
              <node concept="2OqwBi" id="1UH1ei6FqTW" role="3clFbw">
                <node concept="2OqwBi" id="1UH1ei6FpqO" role="2Oq$k0">
                  <node concept="2OqwBi" id="1UH1ei6FpqP" role="2Oq$k0">
                    <node concept="3TrEf2" id="1UH1ei6FpJr" role="2OqNvi">
                      <ref role="3Tt5mk" to="c07g:KwXu1X1JZ9" />
                    </node>
                    <node concept="1y4W85" id="1UH1ei6FpqR" role="2Oq$k0">
                      <node concept="37vLTw" id="1UH1ei6FpqS" role="1y58nS">
                        <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                      </node>
                      <node concept="37vLTw" id="1UH1ei6FpqT" role="1y566C">
                        <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                      </node>
                    </node>
                  </node>
                  <node concept="3Tsc0h" id="1UH1ei6FpXb" role="2OqNvi">
                    <ref role="3TtcxE" to="c07g:KwXu1WyoBF" />
                  </node>
                </node>
                <node concept="1v1jN8" id="1UH1ei6FtLL" role="2OqNvi" />
              </node>
            </node>
            <node concept="3clFbJ" id="1UH1ei6Fubj" role="3cqZAp">
              <node concept="3clFbS" id="1UH1ei6Fubk" role="3clFbx">
                <node concept="3clFbF" id="1UH1ei6FurW" role="3cqZAp">
                  <node concept="2OqwBi" id="1UH1ei6FurX" role="3clFbG">
                    <node concept="2OqwBi" id="1UH1ei6FurY" role="2Oq$k0">
                      <node concept="1y4W85" id="1UH1ei6FurZ" role="2Oq$k0">
                        <node concept="37vLTw" id="1UH1ei6Fus0" role="1y58nS">
                          <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                        </node>
                        <node concept="37vLTw" id="1UH1ei6Fus1" role="1y566C">
                          <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                        </node>
                      </node>
                      <node concept="3TrEf2" id="1UH1ei6Fus2" role="2OqNvi">
                        <ref role="3Tt5mk" to="c07g:KwXu1X1JZ9" />
                      </node>
                    </node>
                    <node concept="2qgKlT" id="1UH1ei6Fus3" role="2OqNvi">
                      <ref role="37wK5l" to="okqk:5FcpIQry5CC" resolve="getFiltersList" />
                    </node>
                  </node>
                </node>
                <node concept="3clFbH" id="1UH1ei6Fubt" role="3cqZAp" />
              </node>
              <node concept="2OqwBi" id="1UH1ei6Fubu" role="3clFbw">
                <node concept="2OqwBi" id="1UH1ei6Fubv" role="2Oq$k0">
                  <node concept="2OqwBi" id="1UH1ei6Fubw" role="2Oq$k0">
                    <node concept="3TrEf2" id="1UH1ei6Fubx" role="2OqNvi">
                      <ref role="3Tt5mk" to="c07g:KwXu1X1JZ9" />
                    </node>
                    <node concept="1y4W85" id="1UH1ei6Fuby" role="2Oq$k0">
                      <node concept="37vLTw" id="1UH1ei6Fubz" role="1y58nS">
                        <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
                      </node>
                      <node concept="37vLTw" id="1UH1ei6Fub$" role="1y566C">
                        <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
                      </node>
                    </node>
                  </node>
                  <node concept="3Tsc0h" id="1UH1ei6FvdO" role="2OqNvi">
                    <ref role="3TtcxE" to="c07g:1JNk8OtBUD9" />
                  </node>
                </node>
                <node concept="1v1jN8" id="1UH1ei6FubA" role="2OqNvi" />
              </node>
            </node>
            <node concept="3clFbH" id="1UH1ei6Fu2D" role="3cqZAp" />
            <node concept="3clFbH" id="1UH1ei6Dj3g" role="3cqZAp" />
          </node>
          <node concept="3cpWsn" id="1UH1ei6CUaX" role="1Duv9x">
            <property role="TrG5h" value="element" />
            <node concept="10Oyi0" id="1UH1ei6CW2s" role="1tU5fm" />
            <node concept="3cmrfG" id="1UH1ei6Dg0j" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
          <node concept="3eOVzh" id="1UH1ei6Dfx$" role="1Dwp0S">
            <node concept="37vLTw" id="1UH1ei6CW2K" role="3uHU7B">
              <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
            </node>
            <node concept="2OqwBi" id="1UH1ei6MmDq" role="3uHU7w">
              <node concept="37vLTw" id="1UH1ei6Mlnu" role="2Oq$k0">
                <ref role="3cqZAo" node="1UH1ei6CuCx" resolve="listOfQuery" />
              </node>
              <node concept="34oBXx" id="1UH1ei6Mxbf" role="2OqNvi" />
            </node>
          </node>
          <node concept="3uNrnE" id="1UH1ei6DfUc" role="1Dwrff">
            <node concept="37vLTw" id="1UH1ei6DfUe" role="2$L3a6">
              <ref role="3cqZAo" node="1UH1ei6CUaX" resolve="element" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="1UH1ei6CINt" role="3cqZAp" />
        <node concept="3clFbH" id="1UH1ei6CISf" role="3cqZAp" />
        <node concept="3clFbH" id="1UH1ei6CIX2" role="3cqZAp" />
        <node concept="3clFbH" id="1UH1ei6CJ1Q" role="3cqZAp" />
      </node>
    </node>
    <node concept="2S6ZIM" id="KwXu1XcJ8B" role="2ZfVej">
      <node concept="3clFbS" id="KwXu1XcJ8C" role="2VODD2">
        <node concept="3cpWs6" id="KwXu1XcJw$" role="3cqZAp">
          <node concept="Xl_RD" id="KwXu1XcJEA" role="3cqZAk">
            <property role="Xl_RC" value="Update Mart Registry" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>
