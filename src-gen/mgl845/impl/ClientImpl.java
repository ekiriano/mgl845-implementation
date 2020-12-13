/**
 */
package mgl845.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import mgl845.Client;
import mgl845.DossierClient;
import mgl845.Mgl845Package;
import mgl845.Reservation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.ClientImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link mgl845.impl.ClientImpl#getDossierclient <em>Dossierclient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends PersonneImpl implements Client {
	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected EList<Reservation> reservation;

	/**
	 * The cached value of the '{@link #getDossierclient() <em>Dossierclient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDossierclient()
	 * @generated
	 * @ordered
	 */
	protected DossierClient dossierclient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reservation> getReservation() {
		if (reservation == null) {
			reservation = new EObjectWithInverseResolvingEList<Reservation>(Reservation.class, this,
					Mgl845Package.CLIENT__RESERVATION, Mgl845Package.RESERVATION__CLIENT);
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DossierClient getDossierclient() {
		return dossierclient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDossierclient(DossierClient newDossierclient, NotificationChain msgs) {
		DossierClient oldDossierclient = dossierclient;
		dossierclient = newDossierclient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.CLIENT__DOSSIERCLIENT, oldDossierclient, newDossierclient);
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
	public void setDossierclient(DossierClient newDossierclient) {
		if (newDossierclient != dossierclient) {
			NotificationChain msgs = null;
			if (dossierclient != null)
				msgs = ((InternalEObject) dossierclient).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mgl845Package.CLIENT__DOSSIERCLIENT, null, msgs);
			if (newDossierclient != null)
				msgs = ((InternalEObject) newDossierclient).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mgl845Package.CLIENT__DOSSIERCLIENT, null, msgs);
			msgs = basicSetDossierclient(newDossierclient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.CLIENT__DOSSIERCLIENT, newDossierclient,
					newDossierclient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reserver() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void louer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.CLIENT__RESERVATION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReservation()).basicAdd(otherEnd, msgs);
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
		case Mgl845Package.CLIENT__RESERVATION:
			return ((InternalEList<?>) getReservation()).basicRemove(otherEnd, msgs);
		case Mgl845Package.CLIENT__DOSSIERCLIENT:
			return basicSetDossierclient(null, msgs);
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
		case Mgl845Package.CLIENT__RESERVATION:
			return getReservation();
		case Mgl845Package.CLIENT__DOSSIERCLIENT:
			return getDossierclient();
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
		case Mgl845Package.CLIENT__RESERVATION:
			getReservation().clear();
			getReservation().addAll((Collection<? extends Reservation>) newValue);
			return;
		case Mgl845Package.CLIENT__DOSSIERCLIENT:
			setDossierclient((DossierClient) newValue);
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
		case Mgl845Package.CLIENT__RESERVATION:
			getReservation().clear();
			return;
		case Mgl845Package.CLIENT__DOSSIERCLIENT:
			setDossierclient((DossierClient) null);
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
		case Mgl845Package.CLIENT__RESERVATION:
			return reservation != null && !reservation.isEmpty();
		case Mgl845Package.CLIENT__DOSSIERCLIENT:
			return dossierclient != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Mgl845Package.CLIENT___RESERVER:
			reserver();
			return null;
		case Mgl845Package.CLIENT___LOUER:
			louer();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClientImpl
