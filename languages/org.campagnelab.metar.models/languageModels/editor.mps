<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:0a5b7473-d87a-4991-982c-209c5bc064e7(org.campagnelab.metar.models.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="3" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="8gqa" ref="r:c14853f5-5f2e-4acc-825a-4fec67caca67(org.campagnelab.metar.tables.editor)" />
    <import index="tpco" ref="r:00000000-0000-4000-0000-011c89590284(jetbrains.mps.lang.core.editor)" />
    <import index="qrzj" ref="r:33ebfe68-dd35-4984-bf5b-c6afb777446c(org.campagnelab.metar.models.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
        <child id="1140524464359" name="emptyCellModel" index="2czzBI" />
        <child id="928328222691832421" name="separatorTextQuery" index="2gpyvW" />
      </concept>
      <concept id="1106270549637" name="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal" flags="nn" index="2iRfu4" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="709996738298806197" name="jetbrains.mps.lang.editor.structure.QueryFunction_SeparatorText" flags="in" index="2o9xnK" />
      <concept id="1142886811589" name="jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_node" flags="nn" index="pncrf" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1164824717996" name="jetbrains.mps.lang.editor.structure.CellMenuDescriptor" flags="ng" index="OXEIz">
        <child id="1164824815888" name="cellMenuPart" index="OY2wv" />
      </concept>
      <concept id="1078939183254" name="jetbrains.mps.lang.editor.structure.CellModel_Component" flags="sg" stub="3162947552742194261" index="PMmxH">
        <reference id="1078939183255" name="editorComponent" index="PMmxG" />
      </concept>
      <concept id="1186403751766" name="jetbrains.mps.lang.editor.structure.FontStyleStyleClassItem" flags="ln" index="Vb9p2" />
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1186414860679" name="jetbrains.mps.lang.editor.structure.EditableStyleClassItem" flags="ln" index="VPxyj" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1381004262292414836" name="jetbrains.mps.lang.editor.structure.ICellStyle" flags="ng" index="1k5N5V">
        <reference id="1381004262292426837" name="parentStyleClass" index="1k5W1q" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1140017977771" name="readOnly" index="1Intyy" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389214265" name="jetbrains.mps.lang.editor.structure.EditorCellModel" flags="ng" index="3EYTF0">
        <child id="1164826688380" name="menuDescriptor" index="P5bDN" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1225898583838" name="jetbrains.mps.lang.editor.structure.ReadOnlyModelAccessor" flags="ng" index="1HfYo3">
        <child id="1225898971709" name="getter" index="1Hhtcw" />
      </concept>
      <concept id="1225900081164" name="jetbrains.mps.lang.editor.structure.CellModel_ReadOnlyModelAccessor" flags="sg" stub="3708815482283559694" index="1HlG4h">
        <child id="1225900141900" name="modelAccessor" index="1HlULh" />
      </concept>
      <concept id="8233876857994246075" name="jetbrains.mps.lang.editor.structure.CellMenuPart_ApplySideTransforms" flags="ng" index="3JiINr">
        <property id="870577895075788418" name="tag" index="2_m5XT" />
        <property id="8233876857994286197" name="side" index="3JiSWl" />
      </concept>
      <concept id="1176717841777" name="jetbrains.mps.lang.editor.structure.QueryFunction_ModelAccess_Getter" flags="in" index="3TQlhw" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
    </language>
  </registry>
  <node concept="24kQdi" id="4ssfE$7TB7c">
    <property role="3GE5qa" value="contrasts" />
    <ref role="1XX52x" to="qrzj:4ssfE$7TB65" resolve="GroupRef" />
    <node concept="1iCGBv" id="4ssfE$7TB7d" role="2wV5jI">
      <ref role="1NtTu8" to="qrzj:4ssfE$7TB66" />
      <ref role="1k5W1q" to="8gqa:2rPl_HMU6tb" resolve="ColumnName" />
      <node concept="1sVBvm" id="4ssfE$7TB7e" role="1sWHZn">
        <node concept="3F0A7n" id="4ssfE$7TB7f" role="2wV5jI">
          <property role="1Intyy" value="true" />
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="VPxyj" id="4ssfE$7TB7g" role="3F10Kt">
            <property role="VOm3f" value="false" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4ssfE$7TB7h">
    <property role="3GE5qa" value="contrasts" />
    <ref role="1XX52x" to="qrzj:4ssfE$7TB61" resolve="ContrastsBinaryOperator" />
    <node concept="3EZMnI" id="4ssfE$7TB7i" role="2wV5jI">
      <node concept="3F1sOY" id="4ssfE$7TB7j" role="3EZMnx">
        <ref role="1NtTu8" to="qrzj:4ssfE$7TB62" />
      </node>
      <node concept="PMmxH" id="4ssfE$7TB7k" role="3EZMnx">
        <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
      </node>
      <node concept="3F1sOY" id="4ssfE$7TB7l" role="3EZMnx">
        <ref role="1NtTu8" to="qrzj:4ssfE$7TB63" />
      </node>
      <node concept="l2Vlx" id="4ssfE$7TB7m" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4ssfE$7TB7n">
    <property role="3GE5qa" value="contrasts" />
    <ref role="1XX52x" to="qrzj:4ssfE$7TB67" resolve="Mean" />
    <node concept="3EZMnI" id="4ssfE$7TB7o" role="2wV5jI">
      <node concept="3F0ifn" id="4ssfE$7TB7p" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="3F2HdR" id="4ssfE$7TB7q" role="3EZMnx">
        <ref role="1NtTu8" to="qrzj:4ssfE$7TB68" />
        <node concept="2iRfu4" id="4ssfE$7TB7r" role="2czzBx" />
        <node concept="3F0ifn" id="4ssfE$7TB7s" role="2czzBI">
          <property role="3F0ifm" value="factors for average?" />
        </node>
        <node concept="2o9xnK" id="4ssfE$7TB7t" role="2gpyvW">
          <node concept="3clFbS" id="4ssfE$7TB7u" role="2VODD2">
            <node concept="3clFbF" id="4ssfE$7TB7v" role="3cqZAp">
              <node concept="Xl_RD" id="4ssfE$7TB7w" role="3clFbG">
                <property role="Xl_RC" value="+" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4ssfE$7TB7x" role="3EZMnx">
        <property role="3F0ifm" value=")/" />
      </node>
      <node concept="1HlG4h" id="4ssfE$7TB7y" role="3EZMnx">
        <node concept="1HfYo3" id="4ssfE$7TB7z" role="1HlULh">
          <node concept="3TQlhw" id="4ssfE$7TB7$" role="1Hhtcw">
            <node concept="3clFbS" id="4ssfE$7TB7_" role="2VODD2">
              <node concept="3clFbF" id="4ssfE$7TB7A" role="3cqZAp">
                <node concept="2YIFZM" id="4ssfE$7TB7B" role="3clFbG">
                  <ref role="37wK5l" to="wyt6:~Integer.toString(int):java.lang.String" resolve="toString" />
                  <ref role="1Pybhc" to="wyt6:~Integer" resolve="Integer" />
                  <node concept="2OqwBi" id="4ssfE$7TB7C" role="37wK5m">
                    <node concept="2OqwBi" id="4ssfE$7TB7D" role="2Oq$k0">
                      <node concept="pncrf" id="4ssfE$7TB7E" role="2Oq$k0" />
                      <node concept="3Tsc0h" id="4ssfE$7TB7F" role="2OqNvi">
                        <ref role="3TtcxE" to="qrzj:4ssfE$7TB68" />
                      </node>
                    </node>
                    <node concept="34oBXx" id="4ssfE$7TB7G" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="4ssfE$7TB7H" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4ssfE$7VtQU">
    <property role="3GE5qa" value="formula" />
    <ref role="1XX52x" to="qrzj:4ssfE$7VtQh" resolve="GroupUsageRef" />
    <node concept="3EZMnI" id="4ssfE$7VtQV" role="2wV5jI">
      <node concept="1iCGBv" id="4ssfE$7VtQW" role="3EZMnx">
        <ref role="1NtTu8" to="qrzj:4ssfE$7VtQi" />
        <node concept="1sVBvm" id="4ssfE$7VtQX" role="1sWHZn">
          <node concept="3F0A7n" id="4ssfE$7VtQY" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            <node concept="VPxyj" id="4ssfE$7VtQZ" role="3F10Kt">
              <property role="VOm3f" value="false" />
            </node>
          </node>
        </node>
        <node concept="VPxyj" id="4ssfE$7VtR0" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="OXEIz" id="4ssfE$7VtR1" role="P5bDN">
          <node concept="3JiINr" id="4ssfE$7VtR2" role="OY2wv">
            <property role="3JiSWl" value="left" />
            <property role="2_m5XT" value="ext_1_RTransform" />
          </node>
          <node concept="3JiINr" id="4ssfE$7VtR3" role="OY2wv">
            <property role="2_m5XT" value="ext_1_RTransform" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="4ssfE$7VtR4" role="2iSdaV" />
      <node concept="OXEIz" id="4ssfE$7VtR5" role="P5bDN">
        <node concept="3JiINr" id="4ssfE$7VtR6" role="OY2wv">
          <property role="3JiSWl" value="left" />
          <property role="2_m5XT" value="ext_1_RTransform" />
        </node>
        <node concept="3JiINr" id="4ssfE$7VtR7" role="OY2wv">
          <property role="2_m5XT" value="ext_1_RTransform" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4ssfE$7VtR8">
    <property role="3GE5qa" value="formula" />
    <ref role="1XX52x" to="qrzj:4ssfE$7VtQb" resolve="BinaryExpression" />
    <node concept="3EZMnI" id="4ssfE$7VtR9" role="2wV5jI">
      <node concept="3F1sOY" id="4ssfE$7VtRa" role="3EZMnx">
        <ref role="1NtTu8" to="qrzj:4ssfE$7VtQc" />
      </node>
      <node concept="PMmxH" id="4ssfE$7VtRb" role="3EZMnx">
        <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
      </node>
      <node concept="3F1sOY" id="4ssfE$7VtRc" role="3EZMnx">
        <ref role="1NtTu8" to="qrzj:4ssfE$7VtQd" />
      </node>
      <node concept="l2Vlx" id="4ssfE$7VtRd" role="2iSdaV" />
      <node concept="OXEIz" id="4ssfE$7VtRe" role="P5bDN">
        <node concept="3JiINr" id="4ssfE$7VtRf" role="OY2wv">
          <property role="2_m5XT" value="ext_1_RTransform" />
        </node>
        <node concept="3JiINr" id="4ssfE$7VtRg" role="OY2wv">
          <property role="3JiSWl" value="left" />
          <property role="2_m5XT" value="ext_1_RTransform" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4ssfE$7VtRh">
    <property role="3GE5qa" value="formula" />
    <ref role="1XX52x" to="qrzj:4ssfE$7VtQe" resolve="GroupFormula" />
    <node concept="3EZMnI" id="4ssfE$7VtRi" role="2wV5jI">
      <node concept="3F0ifn" id="4ssfE$7VtRj" role="3EZMnx">
        <property role="3F0ifm" value="~" />
        <node concept="Vb9p2" id="4ssfE$7VtRk" role="3F10Kt" />
      </node>
      <node concept="3F1sOY" id="4ssfE$7VtRl" role="3EZMnx">
        <ref role="1NtTu8" to="qrzj:4ssfE$7VtQf" />
      </node>
      <node concept="l2Vlx" id="4ssfE$7VtRm" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4ssfE$7VtRn">
    <property role="3GE5qa" value="formula" />
    <ref role="1XX52x" to="qrzj:4ssfE$7VtQk" resolve="NoIntercept" />
    <node concept="3EZMnI" id="4ssfE$7VtRo" role="2wV5jI">
      <node concept="3F0ifn" id="4ssfE$7VtRp" role="3EZMnx">
        <property role="3F0ifm" value="0" />
      </node>
      <node concept="l2Vlx" id="4ssfE$7VtRq" role="2iSdaV" />
    </node>
  </node>
</model>

