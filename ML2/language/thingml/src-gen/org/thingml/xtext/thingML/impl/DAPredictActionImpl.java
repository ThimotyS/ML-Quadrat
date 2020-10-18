/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.xtext.thingML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.thingml.xtext.thingML.DAPredictAction;
import org.thingml.xtext.thingML.DataAnalytics;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DA Predict Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.DAPredictActionImpl#getDataAnalytics <em>Data Analytics</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DAPredictActionImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAPredictActionImpl extends ActionImpl implements DAPredictAction
{
  /**
   * The cached value of the '{@link #getDataAnalytics() <em>Data Analytics</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataAnalytics()
   * @generated
   * @ordered
   */
  protected DataAnalytics dataAnalytics;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Property> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DAPredictActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ThingMLPackage.Literals.DA_PREDICT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAnalytics getDataAnalytics()
  {
    if (dataAnalytics != null && dataAnalytics.eIsProxy())
    {
      InternalEObject oldDataAnalytics = (InternalEObject)dataAnalytics;
      dataAnalytics = (DataAnalytics)eResolveProxy(oldDataAnalytics);
      if (dataAnalytics != oldDataAnalytics)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.DA_PREDICT_ACTION__DATA_ANALYTICS, oldDataAnalytics, dataAnalytics));
      }
    }
    return dataAnalytics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAnalytics basicGetDataAnalytics()
  {
    return dataAnalytics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataAnalytics(DataAnalytics newDataAnalytics)
  {
    DataAnalytics oldDataAnalytics = dataAnalytics;
    dataAnalytics = newDataAnalytics;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DA_PREDICT_ACTION__DATA_ANALYTICS, oldDataAnalytics, dataAnalytics));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectResolvingEList<Property>(Property.class, this, ThingMLPackage.DA_PREDICT_ACTION__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ThingMLPackage.DA_PREDICT_ACTION__DATA_ANALYTICS:
        if (resolve) return getDataAnalytics();
        return basicGetDataAnalytics();
      case ThingMLPackage.DA_PREDICT_ACTION__FEATURES:
        return getFeatures();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ThingMLPackage.DA_PREDICT_ACTION__DATA_ANALYTICS:
        setDataAnalytics((DataAnalytics)newValue);
        return;
      case ThingMLPackage.DA_PREDICT_ACTION__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Property>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ThingMLPackage.DA_PREDICT_ACTION__DATA_ANALYTICS:
        setDataAnalytics((DataAnalytics)null);
        return;
      case ThingMLPackage.DA_PREDICT_ACTION__FEATURES:
        getFeatures().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ThingMLPackage.DA_PREDICT_ACTION__DATA_ANALYTICS:
        return dataAnalytics != null;
      case ThingMLPackage.DA_PREDICT_ACTION__FEATURES:
        return features != null && !features.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DAPredictActionImpl
