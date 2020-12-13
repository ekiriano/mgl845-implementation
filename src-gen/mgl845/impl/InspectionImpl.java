/**
 */
package mgl845.impl;

import mgl845.Inspection;
import mgl845.Mgl845Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.InspectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link mgl845.impl.InspectionImpl#getDetailnspectiom <em>Detailnspectiom</em>}</li>
 *   <li>{@link mgl845.impl.InspectionImpl#isEstEnInfractiom <em>Est En Infractiom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InspectionImpl extends MinimalEObjectImpl.Container implements Inspection {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailnspectiom() <em>Detailnspectiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailnspectiom()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILNSPECTIOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailnspectiom() <em>Detailnspectiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailnspectiom()
	 * @generated
	 * @ordered
	 */
	protected String detailnspectiom = DETAILNSPECTIOM_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstEnInfractiom() <em>Est En Infractiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstEnInfractiom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_EN_INFRACTIOM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstEnInfractiom() <em>Est En Infractiom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstEnInfractiom()
	 * @generated
	 * @ordered
	 */
	protected boolean estEnInfractiom = EST_EN_INFRACTIOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.INSPECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.INSPECTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetailnspectiom() {
		return detailnspectiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailnspectiom(String newDetailnspectiom) {
		String oldDetailnspectiom = detailnspectiom;
		detailnspectiom = newDetailnspectiom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.INSPECTION__DETAILNSPECTIOM,
					oldDetailnspectiom, detailnspectiom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstEnInfractiom() {
		return estEnInfractiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstEnInfractiom(boolean newEstEnInfractiom) {
		boolean oldEstEnInfractiom = estEnInfractiom;
		estEnInfractiom = newEstEnInfractiom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.INSPECTION__EST_EN_INFRACTIOM,
					oldEstEnInfractiom, estEnInfractiom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mgl845Package.INSPECTION__ID:
			return getId();
		case Mgl845Package.INSPECTION__DETAILNSPECTIOM:
			return getDetailnspectiom();
		case Mgl845Package.INSPECTION__EST_EN_INFRACTIOM:
			return isEstEnInfractiom();
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
		case Mgl845Package.INSPECTION__ID:
			setId((Integer) newValue);
			return;
		case Mgl845Package.INSPECTION__DETAILNSPECTIOM:
			setDetailnspectiom((String) newValue);
			return;
		case Mgl845Package.INSPECTION__EST_EN_INFRACTIOM:
			setEstEnInfractiom((Boolean) newValue);
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
		case Mgl845Package.INSPECTION__ID:
			setId(ID_EDEFAULT);
			return;
		case Mgl845Package.INSPECTION__DETAILNSPECTIOM:
			setDetailnspectiom(DETAILNSPECTIOM_EDEFAULT);
			return;
		case Mgl845Package.INSPECTION__EST_EN_INFRACTIOM:
			setEstEnInfractiom(EST_EN_INFRACTIOM_EDEFAULT);
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
		case Mgl845Package.INSPECTION__ID:
			return id != ID_EDEFAULT;
		case Mgl845Package.INSPECTION__DETAILNSPECTIOM:
			return DETAILNSPECTIOM_EDEFAULT == null ? detailnspectiom != null
					: !DETAILNSPECTIOM_EDEFAULT.equals(detailnspectiom);
		case Mgl845Package.INSPECTION__EST_EN_INFRACTIOM:
			return estEnInfractiom != EST_EN_INFRACTIOM_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", detailnspectiom: ");
		result.append(detailnspectiom);
		result.append(", estEnInfractiom: ");
		result.append(estEnInfractiom);
		result.append(')');
		return result.toString();
	}

} //InspectionImpl
