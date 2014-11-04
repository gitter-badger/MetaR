package org.campagnelab.runR.plugin;

/*Generated by MPS */

import com.intellij.execution.configurations.ConfigurationType;
import javax.swing.Icon;
import com.intellij.icons.AllIcons;
import java.util.List;
import com.intellij.execution.configurations.ConfigurationFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.openapi.extensions.Extensions;

public class RScript_Kind implements ConfigurationType {
  private static final Icon ICON = AllIcons.RunConfigurations.Application;
  private final List<ConfigurationFactory> myForeignFactories = ListSequence.fromList(new ArrayList<ConfigurationFactory>());

  public RScript_Kind() {
  }

  public ConfigurationFactory[] getConfigurationFactories() {
    List<ConfigurationFactory> result = ListSequence.fromList(new ArrayList<ConfigurationFactory>());
    ListSequence.fromList(result).addElement(new R_Configuration_Factory(this));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(myForeignFactories));
    return ListSequence.fromList(result).toGenericArray(ConfigurationFactory.class);
  }

  @NonNls
  @NotNull
  public String getId() {
    return "R Script";
  }

  public Icon getIcon() {
    return ICON;
  }

  public String getConfigurationTypeDescription() {
    return null;
  }

  public String getDisplayName() {
    return "R Script";
  }

  public void addForeignFactory(ConfigurationFactory factory) {
    ListSequence.fromList(myForeignFactories).addElement(factory);
  }

  public static RScript_Kind getInstance() {
    return ContainerUtil.findInstance(Extensions.getExtensions(CONFIGURATION_TYPE_EP), RScript_Kind.class);
  }
}