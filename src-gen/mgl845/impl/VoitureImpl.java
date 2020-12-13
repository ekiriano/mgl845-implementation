/**
 */
package mgl845.impl;

import mgl845.AgenceArivee;
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
 * An implementation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.VoitureImpl#getTransfet <em>Transfet</em>}</li>
 *   <li>{@link mgl845.impl.VoitureImpl#getAgencearivee <em>Agencearivee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoitureImpl extends MinimalEObjectImpl.Container implements Voiture {
	/**
	 * The cached value of the '{@link #getTransfet() <em>Transfet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfet()
	 * @generated
	 * @ordered
	 */
	protected Transfet transfet;
	/**
	 * The cached value of the '{@link #getAgencearivee() <em>Agencearivee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgencearivee()
	 * @generated
	 * @ordered
	 */
	protected AgenceArivee agencearivee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoitureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.VOITURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transfet getTransfet() {
		if (transfet != null && transfet.eIsProxy()) {
			InternalEObject oldTransfet = (InternalEObject) transfet;
			transfet = (Transfet) eResolveProxy(oldTransfet);
			if (transfet != oldTransfet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.VOITURE__TRANSFET,
							oldTransfet, transfet));
			}
		}
		return transfet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transfet basicGetTransfet() {
		return transfet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransfet(Transfet newTransfet, NotificationChain msgs) {
		Transfet oldTransfet = transfet;
		transfet = newTransfet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.VOITURE__TRANSFET, oldTransfet, newTransfet);
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
	public void setTransfet(Transfet newTransfet) {
		if (newTransfet != transfet) {
			NotificationChain msgs = null;
			if (transfet != null)
				msgs = ((InternalEObject) transfet).eInverseRemove(this, Mgl845Package.TRANSFET__VOITURE,
						Transfet.class, msgs);
			if (newTransfet != null)
				msgs = ((InternalEObject) newTransfet).eInverseAdd(this, Mgl845Package.TRANSFET__VOITURE,
						Transfet.class, msgs);
			msgs = basicSetTransfet(newTransfet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.VOITURE__TRANSFET, newTransfet,
					newTransfet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceArivee getAgencearivee() {
		if (agencearivee != null && agencearivee.eIsProxy()) {
			InternalEObject oldAgencearivee = (InternalEObject) agencearivee;
			agencearivee = (AgenceArivee) eResolveProxy(oldAgencearivee);
			if (agencearivee != oldAgencearivee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.VOITURE__AGENCEARIVEE,
							oldAgencearivee, agencearivee));
			}
		}
		return agencearivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceArivee basicGetAgencearivee() {
		return agencearivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgencearivee(AgenceArivee newAgencearivee, NotificationChain msgs) {
		AgenceArivee oldAgencearivee = agencearivee;
		agencearivee = newAgencearivee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.VOITURE__AGENCEARIVEE, oldAgencearivee, newAgencearivee);
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
	public void setAgencearivee(AgenceArivee newAgencearivee) {
		if (newAgencearivee != agencearivee) {
			NotificationChain msgs = null;
			if (agencearivee != null)
				msgs = ((InternalEObject) agencearivee).eInverseRemove(this, Mgl845Package.AGENCE_ARIVEE__VOITURE,
						AgenceArivee.class, msgs);
			if (newAgencearivee != null)
				msgs = ((InternalEObject) newAgencearivee).eInverseAdd(this, Mgl845Package.AGENCE_ARIVEE__VOITURE,
						AgenceArivee.class, msgs);
			msgs = basicSetAgencearivee(newAgencearivee, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.VOITURE__AGENCEARIVEE, newAgencearivee,
					newAgencearivee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.VOITURE__TRANSFET:
			if (transfet != null)
				msgs = ((InternalEObject) transfet).eInverseRemove(this, Mgl845Package.TRANSFET__VOITURE,
						Transfet.class, msgs);
			return basicSetTransfet((Transfet) otherEnd, msgs);
		case Mgl845Package.VOITURE__AGENCEARIVEE:
			if (agencearivee != null)
				msgs = ((InternalEObject) agencearivee).eInverseRemove(this, Mgl845Package.AGENCE_ARIVEE__VOITURE,
						AgenceArivee.class, msgs);
			return basicSetAgencearivee((AgenceArivee) otherEnd, msgs);
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
		case Mgl845Package.VOITURE__TRANSFET:
			return basicSetTransfet(null, msgs);
		case Mgl845Package.VOITURE__AGENCEARIVEE:
			return basicSetAgencearivee(null, msgs);
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
		case Mgl845Package.VOITURE__TRANSFET:
			if (resolve)
				return getTransfet();
			return basicGetTransfet();
		case Mgl845Package.VOITURE__AGENCEARIVEE:
			if (resolve)
				return getAgencearivee();
			return basicGetAgencearivee();
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
		case Mgl845Package.VOITURE__TRANSFET:
			setTransfet((Transfet) newValue);
			return;
		case Mgl845Package.VOITURE__AGENCEARIVEE:
			setAgencearivee((AgenceArivee) newValue);
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
		case Mgl845Package.VOITURE__TRANSFET:
			setTransfet((Transfet) null);
			return;
		case Mgl845Package.VOITURE__AGENCEARIVEE:
			setAgencearivee((AgenceArivee) null);
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
		case Mgl845Package.VOITURE__TRANSFET:
			return transfet != null;
		case Mgl845Package.VOITURE__AGENCEARIVEE:
			return agencearivee != null;
		}
		return super.eIsSet(featureID);
	}

} //VoitureImpl
