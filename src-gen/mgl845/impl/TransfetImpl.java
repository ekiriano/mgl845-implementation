/**
 */
package mgl845.impl;

import java.util.Date;
import mgl845.Agence;
import mgl845.Mgl845Package;
import mgl845.Transfet;
import mgl845.Voiture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.TransfetImpl#getVoiture <em>Voiture</em>}</li>
 *   <li>{@link mgl845.impl.TransfetImpl#getAgence <em>Agence</em>}</li>
 *   <li>{@link mgl845.impl.TransfetImpl#getDateTransfert <em>Date Transfert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransfetImpl extends MinimalEObjectImpl.Container implements Transfet {
	/**
	 * The cached value of the '{@link #getVoiture() <em>Voiture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoiture()
	 * @generated
	 * @ordered
	 */
	protected Voiture voiture;

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
	 * The default value of the '{@link #getDateTransfert() <em>Date Transfert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTransfert()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TRANSFERT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateTransfert() <em>Date Transfert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTransfert()
	 * @generated
	 * @ordered
	 */
	protected Date dateTransfert = DATE_TRANSFERT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransfetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.TRANSFET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture getVoiture() {
		if (voiture != null && voiture.eIsProxy()) {
			InternalEObject oldVoiture = (InternalEObject) voiture;
			voiture = (Voiture) eResolveProxy(oldVoiture);
			if (voiture != oldVoiture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.TRANSFET__VOITURE,
							oldVoiture, voiture));
			}
		}
		return voiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture basicGetVoiture() {
		return voiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVoiture(Voiture newVoiture, NotificationChain msgs) {
		Voiture oldVoiture = voiture;
		voiture = newVoiture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.TRANSFET__VOITURE, oldVoiture, newVoiture);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoiture(Voiture newVoiture) {
		if (newVoiture != voiture) {
			NotificationChain msgs = null;
			if (voiture != null)
				msgs = ((InternalEObject) voiture).eInverseRemove(this, Mgl845Package.VOITURE__TRANSFET, Voiture.class,
						msgs);
			if (newVoiture != null)
				msgs = ((InternalEObject) newVoiture).eInverseAdd(this, Mgl845Package.VOITURE__TRANSFET, Voiture.class,
						msgs);
			msgs = basicSetVoiture(newVoiture, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.TRANSFET__VOITURE, newVoiture,
					newVoiture));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.TRANSFET__AGENCE, oldAgence,
							agence));
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
	public NotificationChain basicSetAgence(Agence newAgence, NotificationChain msgs) {
		Agence oldAgence = agence;
		agence = newAgence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.TRANSFET__AGENCE, oldAgence, newAgence);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgence(Agence newAgence) {
		if (newAgence != agence) {
			NotificationChain msgs = null;
			if (agence != null)
				msgs = ((InternalEObject) agence).eInverseRemove(this, Mgl845Package.AGENCE__TRANSFET, Agence.class,
						msgs);
			if (newAgence != null)
				msgs = ((InternalEObject) newAgence).eInverseAdd(this, Mgl845Package.AGENCE__TRANSFET, Agence.class,
						msgs);
			msgs = basicSetAgence(newAgence, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.TRANSFET__AGENCE, newAgence,
					newAgence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTransfert() {
		return dateTransfert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTransfert(Date newDateTransfert) {
		Date oldDateTransfert = dateTransfert;
		dateTransfert = newDateTransfert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.TRANSFET__DATE_TRANSFERT,
					oldDateTransfert, dateTransfert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.TRANSFET__VOITURE:
			if (voiture != null)
				msgs = ((InternalEObject) voiture).eInverseRemove(this, Mgl845Package.VOITURE__TRANSFET, Voiture.class,
						msgs);
			return basicSetVoiture((Voiture) otherEnd, msgs);
		case Mgl845Package.TRANSFET__AGENCE:
			if (agence != null)
				msgs = ((InternalEObject) agence).eInverseRemove(this, Mgl845Package.AGENCE__TRANSFET, Agence.class,
						msgs);
			return basicSetAgence((Agence) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.TRANSFET__VOITURE:
			return basicSetVoiture(null, msgs);
		case Mgl845Package.TRANSFET__AGENCE:
			return basicSetAgence(null, msgs);
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
		case Mgl845Package.TRANSFET__VOITURE:
			if (resolve)
				return getVoiture();
			return basicGetVoiture();
		case Mgl845Package.TRANSFET__AGENCE:
			if (resolve)
				return getAgence();
			return basicGetAgence();
		case Mgl845Package.TRANSFET__DATE_TRANSFERT:
			return getDateTransfert();
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
		case Mgl845Package.TRANSFET__VOITURE:
			setVoiture((Voiture) newValue);
			return;
		case Mgl845Package.TRANSFET__AGENCE:
			setAgence((Agence) newValue);
			return;
		case Mgl845Package.TRANSFET__DATE_TRANSFERT:
			setDateTransfert((Date) newValue);
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
		case Mgl845Package.TRANSFET__VOITURE:
			setVoiture((Voiture) null);
			return;
		case Mgl845Package.TRANSFET__AGENCE:
			setAgence((Agence) null);
			return;
		case Mgl845Package.TRANSFET__DATE_TRANSFERT:
			setDateTransfert(DATE_TRANSFERT_EDEFAULT);
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
		case Mgl845Package.TRANSFET__VOITURE:
			return voiture != null;
		case Mgl845Package.TRANSFET__AGENCE:
			return agence != null;
		case Mgl845Package.TRANSFET__DATE_TRANSFERT:
			return DATE_TRANSFERT_EDEFAULT == null ? dateTransfert != null
					: !DATE_TRANSFERT_EDEFAULT.equals(dateTransfert);
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
		result.append(" (dateTransfert: ");
		result.append(dateTransfert);
		result.append(')');
		return result.toString();
	}

} //TransfetImpl
