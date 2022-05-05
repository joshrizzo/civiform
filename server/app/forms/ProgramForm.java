package forms;

import services.program.ProgramDefinition;

/** Form for updating name and description of a program. */
public class ProgramForm {
  private String adminName;
  private String adminDescription;
  private String localizedDisplayName;
  private String localizedDisplayDescription;
  private String externalLink;
  private String displayMode;

  public ProgramForm() {
    adminName = "";
    adminDescription = "";
    localizedDisplayName = "";
    localizedDisplayDescription = "";
    externalLink = "";
    displayMode = "";
  }

  // INTERVIEW NOTE: There might be a better convention for this object conversion in the project...
  public ProgramForm(ProgramDefinition program) {
    adminName = program.adminName();
    adminDescription = program.adminDescription();
    // INTERVIEW NOTE: we might need to pass an actual locale here...
    localizedDisplayName = program.localizedName().getDefault();
    localizedDisplayDescription = program.localizedDescription().getDefault();
    externalLink = program.externalLink();
    displayMode = program.displayMode().getValue();
  }

  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }

  public String getAdminDescription() {
    return adminDescription;
  }

  public void setAdminDescription(String adminDescription) {
    this.adminDescription = adminDescription;
  }

  public String getExternalLink() {
    return externalLink;
  }

  public void setExternalLink(String externalLink) {
    this.externalLink = externalLink;
  }

  public String getDisplayMode() {
    return displayMode;
  }

  public void setDisplayMode(String displayMode) {
    this.displayMode = displayMode;
  }

  public String getLocalizedDisplayName() {
    return localizedDisplayName;
  }

  public String getLocalizedDisplayDescription() {
    return localizedDisplayDescription;
  }

  public void setLocalizedDisplayName(String localizedDisplayName) {
    this.localizedDisplayName = localizedDisplayName;
  }

  public void setLocalizedDisplayDescription(String localizedDisplayDescription) {
    this.localizedDisplayDescription = localizedDisplayDescription;
  }
}
