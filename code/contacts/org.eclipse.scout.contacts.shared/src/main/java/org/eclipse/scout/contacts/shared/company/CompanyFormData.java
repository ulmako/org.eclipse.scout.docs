/*******************************************************************************
 * Copyright (c) 2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.contacts.shared.company;

import javax.annotation.Generated;

import org.eclipse.scout.contacts.shared.template.AbstractAddressBoxData;
import org.eclipse.scout.contacts.shared.template.AbstractEmailFieldData;
import org.eclipse.scout.contacts.shared.template.AbstractPhoneFieldData;
import org.eclipse.scout.contacts.shared.template.AbstractPictureBoxData;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 *
 * @generated
 */
@Generated(value = "FormDataUpdateOperation", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class CompanyFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public CompanyFormData() {
  }

  public AddressBox getAddressBox() {
    return getFieldByClass(AddressBox.class);
  }

  public Comments getComments() {
    return getFieldByClass(Comments.class);
  }

  /**
   * access method for property CompanyId.
   */
  public String getCompanyId() {
    return getCompanyIdProperty().getValue();
  }

  /**
   * access method for property CompanyId.
   */
  public void setCompanyId(String companyId) {
    getCompanyIdProperty().setValue(companyId);
  }

  public CompanyIdProperty getCompanyIdProperty() {
    return getPropertyByClass(CompanyIdProperty.class);
  }

  public Email getEmail() {
    return getFieldByClass(Email.class);
  }

  public Homepage getHomepage() {
    return getFieldByClass(Homepage.class);
  }

  public LogoBox getLogoBox() {
    return getFieldByClass(LogoBox.class);
  }

  public Name getName() {
    return getFieldByClass(Name.class);
  }

  public Phone getPhone() {
    return getFieldByClass(Phone.class);
  }

  public static class AddressBox extends AbstractAddressBoxData {

    private static final long serialVersionUID = 1L;

    public AddressBox() {
    }
  }

  public static class Comments extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Comments() {
    }
  }

  public static class CompanyIdProperty extends AbstractPropertyData<String> {

    private static final long serialVersionUID = 1L;

    public CompanyIdProperty() {
    }
  }

  public static class Email extends AbstractEmailFieldData {

    private static final long serialVersionUID = 1L;

    public Email() {
    }
  }

  public static class Homepage extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Homepage() {
    }
  }

  public static class LogoBox extends AbstractPictureBoxData {

    private static final long serialVersionUID = 1L;

    public LogoBox() {
    }
  }

  public static class Name extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Name() {
    }
  }

  public static class Phone extends AbstractPhoneFieldData {

    private static final long serialVersionUID = 1L;

    public Phone() {
    }
  }
}