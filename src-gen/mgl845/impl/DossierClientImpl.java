/**
 */
package mgl845.impl;

import java.util.Collection;

import mgl845.DossierClient;
import mgl845.Inspection;
import mgl845.Mgl845Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dossier Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.DossierClientImpl#getNumeroDossier <em>Numero Dossier</em>}</li>
 *   <li>{@link mgl845.impl.DossierClientImpl#getNbInfraction <em>Nb Infraction</em>}</li>
 *   <li>{@link mgl845.impl.DossierClientImpl#getInspection <em>Inspection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DossierClientImpl extends MinimalEObjectImpl.Container implements DossierClient {
	/**
	 * The default value of the '{@link #getNumeroDossier() <em>Numero Dossier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDossier()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_DOSSIER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumeroDossier() <em>Numero Dossier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDossier()
	 * @generated
	 * @ordered
	 */
	protected int numeroDossier = NUMERO_DOSSIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbInfraction() <em>Nb Infraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbInfraction()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_INFRACTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbInfraction() <em>Nb Infraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbInfraction()
	 * @generated
	 * @ordered
	 */
	protected int nbInfraction = NB_INFRACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInspection() <em>Inspection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspection()
	 * @generated
	 * @ordered
	 */
	protected EList<Inspection> inspection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DossierClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.DOSSIER_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroDossier() {
		return numeroDossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroDossier(int newNumeroDossier) {
		int oldNumeroDossier = numeroDossier;
		numeroDossier = newNumeroDossier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.DOSSIER_CLIENT__NUMERO_DOSSIER,
					oldNumeroDossier, numeroDossier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbInfraction() {
		return nbInfraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbInfraction(int newNbInfraction) {
		int oldNbInfraction = nbInfraction;
		nbInfraction = newNbInfraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.DOSSIER_CLIENT__NB_INFRACTION,
					oldNbInfraction, nbInfraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inspection> getInspection() {
		if (inspection == null) {
			inspection = new EObjectContainmentEList<Inspection>(Inspection.class, this,
					Mgl845Package.DOSSIER_CLIENT__INSPECTION);
		}
		return inspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.DOSSIER_CLIENT__INSPECTION:
			return ((InternalEList<?>) getInspection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mgl845Package.DOSSIER_CLIENT__NUMERO_DOSSIER:
			return getNumeroDossier();
		case Mgl845Package.DOSSIER_CLIENT__NB_INFRACTION:
			return getNbInfraction();
		case Mgl845Package.DOSSIER_CLIENT__INSPECTION:
			return getInspection();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Mgl845Package.DOSSIER_CLIENT__NUMERO_DOSSIER:
			setNumeroDossier((Integer) newValue);
			return;
		case Mgl845Package.DOSSIER_CLIENT__NB_INFRACTION:
			setNbInfraction((Integer) newValue);
			return;
		case Mgl845Package.DOSSIER_CLIENT__INSPECTION:
			getInspection().clear();
			getInspection().addAll((Collection<? extends Inspection>) newValue);
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
		case Mgl845Package.DOSSIER_CLIENT__NUMERO_DOSSIER:
			setNumeroDossier(NUMERO_DOSSIER_EDEFAULT);
			return;
		case Mgl845Package.DOSSIER_CLIENT__NB_INFRACTION:
			setNbInfraction(NB_INFRACTION_EDEFAULT);
			return;
		case Mgl845Package.DOSSIER_CLIENT__INSPECTION:
			getInspection().clear();
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
		case Mgl845Package.DOSSIER_CLIENT__NUMERO_DOSSIER:
			return numeroDossier != NUMERO_DOSSIER_EDEFAULT;
		case Mgl845Package.DOSSIER_CLIENT__NB_INFRACTION:
			return nbInfraction != NB_INFRACTION_EDEFAULT;
		case Mgl845Package.DOSSIER_CLIENT__INSPECTION:
			return inspection != null && !inspection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (numeroDossier: ");
		result.append(numeroDossier);
		result.append(", nbInfraction: ");
		result.append(nbInfraction);
		result.append(')');
		return result.toString();
	}

} //DossierClientImpl
