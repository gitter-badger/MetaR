package org.campagnelab.runR.plugin;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import java.io.File;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.util.MacrosFactory;

public class R_Options extends MultiTuple._2<String, File> implements Cloneable {
  public R_Options() {
    super();
  }

  public R_Options(String R_HOME, File workingDirectory) {
    super(R_HOME, workingDirectory);
  }

  public String R_HOME(String value) {
    return super._0(value);
  }

  public File workingDirectory(File value) {
    return super._1(value);
  }

  public String R_HOME() {
    return super._0();
  }

  public File workingDirectory() {
    return super._1();
  }

  @SuppressWarnings(value = "unchecked")
  public R_Options assignFrom(Tuples._2<String, File> from) {
    return (R_Options) super.assign(from);
  }

  public R_Options clone() {
    String env = System.getenv().get("R_HOME");
    if (this.R_HOME() == null && env != null) {
      this.R_HOME(env);
    }

    String pathVar = MacrosFactory.getGlobal().expandPath("${R_HOME}");
    if (this.R_HOME() == null && pathVar != null) {
      this.R_HOME(pathVar);
    }
    String dir = MacrosFactory.getGlobal().expandPath("${org.campagnelab.hta.results_dir}");
    File workingDir = new File(dir);
    if (this.workingDirectory() == null && workingDir.exists()) {
      this.workingDirectory(workingDir);
    }

    // clone by instanciating a literal of R_Options 
    // first choice in auto-completion menu: R_Options literal 
    return new R_Options(this.R_HOME(), this.workingDirectory());
  }
}
