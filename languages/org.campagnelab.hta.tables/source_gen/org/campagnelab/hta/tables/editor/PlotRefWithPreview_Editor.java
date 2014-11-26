package org.campagnelab.hta.tables.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Image;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.campagnelab.hta.tables.behavior.Plot_Behavior;

public class PlotRefWithPreview_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_9p3cny_a(editorContext, node);
  }

  private EditorCell createCollection_9p3cny_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_9p3cny_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefCell_9p3cny_a0(editorContext, node));
    if (renderingCondition_9p3cny_a1a(node, editorContext)) {
      editorCell.addEditorCell(this.createImage_9p3cny_b0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createRefCell_9p3cny_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("plot");
    provider.setNoTargetText("<no plot>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new PlotRefWithPreview_Editor._Inline_9p3cny_a0a());
    editorCell = provider.createEditorCell(editorContext);
    if (editorCell.getRole() == null) {
      editorCell.setReferenceCell(true);
      editorCell.setRole("plot");
    }
    Style style = new StyleImpl();
    TableStyleSheet_StyleSheet.apply_Plot(style, editorCell);
    style.set(StyleAttributes.EDITABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createNodeRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class _Inline_9p3cny_a0a extends InlineCellProvider {
    public _Inline_9p3cny_a0a() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_9p3cny_a0a0(editorContext, node);
    }

    private EditorCell createProperty_9p3cny_a0a0(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name");
      Style style = new StyleImpl();
      TableStyleSheet_StyleSheet.apply_Plot(style, editorCell);
      editorCell.getStyle().putAll(style);
      editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new PlotRefWithPreview_Editor._Inline_9p3cny_a0a.Plot_generic_cellMenu_9p3cny_a0a0a0()}));
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = editorContext.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createNodeRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
      } else
      return editorCell;
    }

    public static class Plot_generic_cellMenu_9p3cny_a0a0a0 extends AbstractCellMenuPart_Generic_Group {
      public Plot_generic_cellMenu_9p3cny_a0a0a0() {
      }

      public List<?> createParameterObjects(final SNode node, IOperationContext operationContext, EditorContext editorContext) {
        return ListSequence.fromList(SNodeOperations.getDescendants(SNodeOperations.getAncestor(node, "org.campagnelab.hta.tables.structure.Analysis", false, false), "org.campagnelab.hta.tables.structure.Plot", false, new String[]{})).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return neq_9p3cny_a0a0a0a0a0a0a1e3(it, node);
          }
        }).toListSequence();
      }

      protected void handleAction(Object parameterObject, SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
        this.handleAction_impl((SNode) parameterObject, node, model, operationContext, editorContext);
      }

      public void handleAction_impl(SNode parameterObject, SNode node, SModel model, IOperationContext operationContext, EditorContext editorContext) {
        SNode preview = SNodeFactoryOperations.createNewNode("org.campagnelab.hta.tables.structure.PlotRefWithPreview", null);
        SLinkOperations.setTarget(preview, "plot", parameterObject, false);
        SNodeOperations.replaceWithAnother(node, preview);
      }

      public boolean isReferentPresentation() {
        return false;
      }

      public String getMatchingText(Object parameterObject) {
        return this.getMatchingText_internal((SNode) parameterObject);
      }

      public String getMatchingText_internal(SNode parameterObject) {
        return SPropertyOperations.getString(parameterObject, "name");
      }

      public String getDescriptionText(Object parameterObject) {
        return this.getDescriptionText_internal((SNode) parameterObject);
      }

      public String getDescriptionText_internal(SNode parameterObject) {
        return SPropertyOperations.getString(parameterObject, "name");
      }

      private static boolean neq_9p3cny_a0a0a0a0a0a0a1e3(Object a, Object b) {
        return !((a != null ? a.equals(b) : a == b));
      }
    }
  }

  private EditorCell createImage_9p3cny_b0(final EditorContext editorContext, final SNode node) {
    EditorCell_Image editorCell;
    editorCell = EditorCell_Image.createImageCell(editorContext, node, new _FunctionTypes._return_P0_E0<String>() {
      public String invoke() {
        return Plot_Behavior.call_getPath_8016431400518331231(SLinkOperations.getTarget(node, "plot", false));
      }
    }.invoke());
    editorCell.setCellId("Image_9p3cny_b0");
    editorCell.setDescent(0);
    return editorCell;
  }

  private static boolean renderingCondition_9p3cny_a1a(SNode node, EditorContext editorContext) {
    return SPropertyOperations.getBoolean(SNodeOperations.getAncestor(node, "org.campagnelab.hta.tables.structure.Multiplot", false, false), "preview");
  }
}
