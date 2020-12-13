/**
 */
package mgl845.impl;

import mgl845.AgenceArivee;
import mgl845.Mgl845Package;
import mgl845.Retour;

import mgl845.Voiture;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agence Arivee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.AgenceAriveeImpl#getVoiture <em>Voiture</em>}</li>
 *   <li>{@link mgl845.impl.AgenceAriveeImpl#getRetour <em>Retour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenceAriveeImpl extends MinimalEObjectImpl.Container implements AgenceArivee {
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
	 * The cached value of the '{@link #getRetour() <em>Retour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetour()
	 * @generated
	 * @ordered
	 */
	protected Retour retour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceAriveeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.AGENCE_ARIVEE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.AGENCE_ARIVEE__VOITURE,
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
					Mgl845Package.AGENCE_ARIVEE__VOITURE, oldVoiture, newVoiture);
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
				msgs = ((InternalEObject) voiture).eInverseRemove(this, Mgl845Package.VOITURE__AGENCEARIVEE,
						Voiture.class, msgs);
			if (newVoiture != null)
				msgs = ((InternalEObject) newVoiture).eInverseAdd(this, Mgl845Package.VOITURE__AGENCEARIVEE,
						Voiture.class, msgs);
			msgs = basicSetVoiture(newVoiture, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.AGENCE_ARIVEE__VOITURE, newVoiture,
					newVoiture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retour getRetour() {
		if (retour != null && retour.eIsProxy()) {
			InternalEObject oldRetour = (InternalEObject) retour;
			retour = (Retour) eResolveProxy(oldRetour);
			if (retour != oldRetour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.AGENCE_ARIVEE__RETOUR,
							oldRetour, retour));
			}
		}
		return retour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Retour basicGetRetour() {
		return retour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetour(Retour newRetour, NotificationChain msgs) {
		Retour oldRetour = retour;
		retour = newRetour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.AGENCE_ARIVEE__RETOUR, oldRetour, newRetour);
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
	public void setRetour(Retour newRetour) {
		if (newRetour != retour) {
			NotificationChain msgs = null;
			if (retour != null)
				msgs = ((InternalEObject) retour).eInverseRemove(this, Mgl845Package.RETOUR__AGENCEARIVEE, Retour.class,
						msgs);
			if (newRetour != null)
				msgs = ((InternalEObject) newRetour).eInverseAdd(this, Mgl845Package.RETOUR__AGENCEARIVEE, Retour.class,
						msgs);
			msgs = basicSetRetour(newRetour, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.AGENCE_ARIVEE__RETOUR, newRetour,
					newRetour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.AGENCE_ARIVEE__VOITURE:
			if (voiture != null)
				msgs = ((InternalEObject) voiture).eInverseRemove(this, Mgl845Package.VOITURE__AGENCEARIVEE,
						Voiture.class, msgs);
			return basicSetVoiture((Voiture) otherEnd, msgs);
		case Mgl845Package.AGENCE_ARIVEE__RETOUR:
			if (retour != null)
				msgs = ((InternalEObject) retour).eInverseRemove(this, Mgl845Package.RETOUR__AGENCEARIVEE, Retour.class,
						msgs);
			return basicSetRetour((Retour) otherEnd, msgs);
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
		case Mgl845Package.AGENCE_ARIVEE__VOITURE:
			return basicSetVoiture(null, msgs);
		case Mgl845Package.AGENCE_ARIVEE__RETOUR:
			return basicSetRetour(null, msgs);
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
		case Mgl845Package.AGENCE_ARIVEE__VOITURE:
			if (resolve)
				return getVoiture();
			return basicGetVoiture();
		case Mgl845Package.AGENCE_ARIVEE__RETOUR:
			if (resolve)
				return getRetour();
			return basicGetRetour();
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
		case Mgl845Package.AGENCE_ARIVEE__VOITURE:
			setVoiture((Voiture) newValue);
			return;
		case Mgl845Package.AGENCE_ARIVEE__RETOUR:
			setRetour((Retour) newValue);
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
		case Mgl845Package.AGENCE_ARIVEE__VOITURE:
			setVoiture((Voiture) null);
			return;
		case Mgl845Package.AGENCE_ARIVEE__RETOUR:
			setRetour((Retour) null);
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
		case Mgl845Package.AGENCE_ARIVEE__VOITURE:
			return voiture != null;
		case Mgl845Package.AGENCE_ARIVEE__RETOUR:
			return retour != null;
		}
		return super.eIsSet(featureID);
	}

} //AgenceAriveeImpl
