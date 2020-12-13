/**
 */
package mgl845.impl;

import mgl845.Mgl845Package;
import mgl845.Paiement;

import mgl845.Reservation;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paiement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.PaiementImpl#getAccompte <em>Accompte</em>}</li>
 *   <li>{@link mgl845.impl.PaiementImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link mgl845.impl.PaiementImpl#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaiementImpl extends MinimalEObjectImpl.Container implements Paiement {
	/**
	 * The default value of the '{@link #getAccompte() <em>Accompte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccompte()
	 * @generated
	 * @ordered
	 */
	protected static final float ACCOMPTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAccompte() <em>Accompte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccompte()
	 * @generated
	 * @ordered
	 */
	protected float accompte = ACCOMPTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected float total = TOTAL_EDEFAULT;

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
	protected PaiementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.PAIEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAccompte() {
		return accompte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccompte(float newAccompte) {
		float oldAccompte = accompte;
		accompte = newAccompte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.PAIEMENT__ACCOMPTE, oldAccompte,
					accompte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(float newTotal) {
		float oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.PAIEMENT__TOTAL, oldTotal, total));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.PAIEMENT__RESERVATION,
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
					Mgl845Package.PAIEMENT__RESERVATION, oldReservation, newReservation);
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
				msgs = ((InternalEObject) reservation).eInverseRemove(this, Mgl845Package.RESERVATION__PAIEMENT,
						Reservation.class, msgs);
			if (newReservation != null)
				msgs = ((InternalEObject) newReservation).eInverseAdd(this, Mgl845Package.RESERVATION__PAIEMENT,
						Reservation.class, msgs);
			msgs = basicSetReservation(newReservation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.PAIEMENT__RESERVATION, newReservation,
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
		case Mgl845Package.PAIEMENT__RESERVATION:
			if (reservation != null)
				msgs = ((InternalEObject) reservation).eInverseRemove(this, Mgl845Package.RESERVATION__PAIEMENT,
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
		case Mgl845Package.PAIEMENT__RESERVATION:
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
		case Mgl845Package.PAIEMENT__ACCOMPTE:
			return getAccompte();
		case Mgl845Package.PAIEMENT__TOTAL:
			return getTotal();
		case Mgl845Package.PAIEMENT__RESERVATION:
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
		case Mgl845Package.PAIEMENT__ACCOMPTE:
			setAccompte((Float) newValue);
			return;
		case Mgl845Package.PAIEMENT__TOTAL:
			setTotal((Float) newValue);
			return;
		case Mgl845Package.PAIEMENT__RESERVATION:
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
		case Mgl845Package.PAIEMENT__ACCOMPTE:
			setAccompte(ACCOMPTE_EDEFAULT);
			return;
		case Mgl845Package.PAIEMENT__TOTAL:
			setTotal(TOTAL_EDEFAULT);
			return;
		case Mgl845Package.PAIEMENT__RESERVATION:
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
		case Mgl845Package.PAIEMENT__ACCOMPTE:
			return accompte != ACCOMPTE_EDEFAULT;
		case Mgl845Package.PAIEMENT__TOTAL:
			return total != TOTAL_EDEFAULT;
		case Mgl845Package.PAIEMENT__RESERVATION:
			return reservation != null;
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
		result.append(" (accompte: ");
		result.append(accompte);
		result.append(", total: ");
		result.append(total);
		result.append(')');
		return result.toString();
	}

} //PaiementImpl
