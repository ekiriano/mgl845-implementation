/**
 */
package mgl845.impl;

import mgl845.Agence;
import mgl845.Gestionnaire;
import mgl845.Mgl845Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gestionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.GestionnaireImpl#getAgence <em>Agence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GestionnaireImpl extends PersonneImpl implements Gestionnaire {
	/**
	 * The cached value of the '{@link #getAgence() <em>Agence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgence()
	 * @generated
	 * @ordered
	 */
	protected Agence agence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.GESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence getAgence() {
		if (agence != null && agence.eIsProxy()) {
			InternalEObject oldAgence = (InternalEObject) agence;
			agence = (Agence) eResolveProxy(oldAgence);
			if (agence != oldAgence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.GESTIONNAIRE__AGENCE,
							oldAgence, agence));
			}
		}
		return agence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agence basicGetAgence() {
		return agence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgence(Agence newAgence) {
		Agence oldAgence = agence;
		agence = newAgence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.GESTIONNAIRE__AGENCE, oldAgence,
					agence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mgl845Package.GESTIONNAIRE__AGENCE:
			if (resolve)
				return getAgence();
			return basicGetAgence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Mgl845Package.GESTIONNAIRE__AGENCE:
			setAgence((Agence) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case Mgl845Package.GESTIONNAIRE__AGENCE:
			setAgence((Agence) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Mgl845Package.GESTIONNAIRE__AGENCE:
			return agence != null;
		}
		return super.eIsSet(featureID);
	}

} //GestionnaireImpl
