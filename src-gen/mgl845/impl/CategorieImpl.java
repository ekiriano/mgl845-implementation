/**
 */
package mgl845.impl;

import mgl845.Categorie;
import mgl845.Mgl845Package;

import mgl845.Reservation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categorie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.CategorieImpl#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategorieImpl extends MinimalEObjectImpl.Container implements Categorie {
	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected Reservation reservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.CATEGORIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getReservation() {
		if (reservation != null && reservation.eIsProxy()) {
			InternalEObject oldReservation = (InternalEObject) reservation;
			reservation = (Reservation) eResolveProxy(oldReservation);
			if (reservation != oldReservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.CATEGORIE__RESERVATION,
							oldReservation, reservation));
			}
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation basicGetReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservation(Reservation newReservation, NotificationChain msgs) {
		Reservation oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.CATEGORIE__RESERVATION, oldReservation, newReservation);
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
	public void setReservation(Reservation newReservation) {
		if (newReservation != reservation) {
			NotificationChain msgs = null;
			if (reservation != null)
				msgs = ((InternalEObject) reservation).eInverseRemove(this, Mgl845Package.RESERVATION__CATEGORIE,
						Reservation.class, msgs);
			if (newReservation != null)
				msgs = ((InternalEObject) newReservation).eInverseAdd(this, Mgl845Package.RESERVATION__CATEGORIE,
						Reservation.class, msgs);
			msgs = basicSetReservation(newReservation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.CATEGORIE__RESERVATION, newReservation,
					newReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.CATEGORIE__RESERVATION:
			if (reservation != null)
				msgs = ((InternalEObject) reservation).eInverseRemove(this, Mgl845Package.RESERVATION__CATEGORIE,
						Reservation.class, msgs);
			return basicSetReservation((Reservation) otherEnd, msgs);
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
		case Mgl845Package.CATEGORIE__RESERVATION:
			return basicSetReservation(null, msgs);
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
		case Mgl845Package.CATEGORIE__RESERVATION:
			if (resolve)
				return getReservation();
			return basicGetReservation();
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
		case Mgl845Package.CATEGORIE__RESERVATION:
			setReservation((Reservation) newValue);
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
		case Mgl845Package.CATEGORIE__RESERVATION:
			setReservation((Reservation) null);
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
		case Mgl845Package.CATEGORIE__RESERVATION:
			return reservation != null;
		}
		return super.eIsSet(featureID);
	}

} //CategorieImpl
