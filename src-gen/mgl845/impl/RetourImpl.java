/**
 */
package mgl845.impl;

import java.util.Date;
import mgl845.AgenceArivee;
import mgl845.Inspection;
import mgl845.Mgl845Package;
import mgl845.Reservation;
import mgl845.Retour;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.RetourImpl#getInspection <em>Inspection</em>}</li>
 *   <li>{@link mgl845.impl.RetourImpl#getAgencearivee <em>Agencearivee</em>}</li>
 *   <li>{@link mgl845.impl.RetourImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link mgl845.impl.RetourImpl#getDateRetour <em>Date Retour</em>}</li>
 *   <li>{@link mgl845.impl.RetourImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetourImpl extends MinimalEObjectImpl.Container implements Retour {
	/**
	 * The cached value of the '{@link #getInspection() <em>Inspection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspection()
	 * @generated
	 * @ordered
	 */
	protected Inspection inspection;

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
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected Reservation reservation;
	/**
	 * The default value of the '{@link #getDateRetour() <em>Date Retour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRetour()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_RETOUR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateRetour() <em>Date Retour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRetour()
	 * @generated
	 * @ordered
	 */
	protected Date dateRetour = DATE_RETOUR_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.RETOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspection getInspection() {
		return inspection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInspection(Inspection newInspection, NotificationChain msgs) {
		Inspection oldInspection = inspection;
		inspection = newInspection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.RETOUR__INSPECTION, oldInspection, newInspection);
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
	public void setInspection(Inspection newInspection) {
		if (newInspection != inspection) {
			NotificationChain msgs = null;
			if (inspection != null)
				msgs = ((InternalEObject) inspection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mgl845Package.RETOUR__INSPECTION, null, msgs);
			if (newInspection != null)
				msgs = ((InternalEObject) newInspection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mgl845Package.RETOUR__INSPECTION, null, msgs);
			msgs = basicSetInspection(newInspection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RETOUR__INSPECTION, newInspection,
					newInspection));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.RETOUR__AGENCEARIVEE,
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
					Mgl845Package.RETOUR__AGENCEARIVEE, oldAgencearivee, newAgencearivee);
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
				msgs = ((InternalEObject) agencearivee).eInverseRemove(this, Mgl845Package.AGENCE_ARIVEE__RETOUR,
						AgenceArivee.class, msgs);
			if (newAgencearivee != null)
				msgs = ((InternalEObject) newAgencearivee).eInverseAdd(this, Mgl845Package.AGENCE_ARIVEE__RETOUR,
						AgenceArivee.class, msgs);
			msgs = basicSetAgencearivee(newAgencearivee, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RETOUR__AGENCEARIVEE, newAgencearivee,
					newAgencearivee));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.RETOUR__RESERVATION,
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
					Mgl845Package.RETOUR__RESERVATION, oldReservation, newReservation);
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
				msgs = ((InternalEObject) reservation).eInverseRemove(this, Mgl845Package.RESERVATION__RETOUR,
						Reservation.class, msgs);
			if (newReservation != null)
				msgs = ((InternalEObject) newReservation).eInverseAdd(this, Mgl845Package.RESERVATION__RETOUR,
						Reservation.class, msgs);
			msgs = basicSetReservation(newReservation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RETOUR__RESERVATION, newReservation,
					newReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateRetour() {
		return dateRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateRetour(Date newDateRetour) {
		Date oldDateRetour = dateRetour;
		dateRetour = newDateRetour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RETOUR__DATE_RETOUR, oldDateRetour,
					dateRetour));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RETOUR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.RETOUR__AGENCEARIVEE:
			if (agencearivee != null)
				msgs = ((InternalEObject) agencearivee).eInverseRemove(this, Mgl845Package.AGENCE_ARIVEE__RETOUR,
						AgenceArivee.class, msgs);
			return basicSetAgencearivee((AgenceArivee) otherEnd, msgs);
		case Mgl845Package.RETOUR__RESERVATION:
			if (reservation != null)
				msgs = ((InternalEObject) reservation).eInverseRemove(this, Mgl845Package.RESERVATION__RETOUR,
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
		case Mgl845Package.RETOUR__INSPECTION:
			return basicSetInspection(null, msgs);
		case Mgl845Package.RETOUR__AGENCEARIVEE:
			return basicSetAgencearivee(null, msgs);
		case Mgl845Package.RETOUR__RESERVATION:
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
		case Mgl845Package.RETOUR__INSPECTION:
			return getInspection();
		case Mgl845Package.RETOUR__AGENCEARIVEE:
			if (resolve)
				return getAgencearivee();
			return basicGetAgencearivee();
		case Mgl845Package.RETOUR__RESERVATION:
			if (resolve)
				return getReservation();
			return basicGetReservation();
		case Mgl845Package.RETOUR__DATE_RETOUR:
			return getDateRetour();
		case Mgl845Package.RETOUR__ID:
			return getId();
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
		case Mgl845Package.RETOUR__INSPECTION:
			setInspection((Inspection) newValue);
			return;
		case Mgl845Package.RETOUR__AGENCEARIVEE:
			setAgencearivee((AgenceArivee) newValue);
			return;
		case Mgl845Package.RETOUR__RESERVATION:
			setReservation((Reservation) newValue);
			return;
		case Mgl845Package.RETOUR__DATE_RETOUR:
			setDateRetour((Date) newValue);
			return;
		case Mgl845Package.RETOUR__ID:
			setId((Integer) newValue);
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
		case Mgl845Package.RETOUR__INSPECTION:
			setInspection((Inspection) null);
			return;
		case Mgl845Package.RETOUR__AGENCEARIVEE:
			setAgencearivee((AgenceArivee) null);
			return;
		case Mgl845Package.RETOUR__RESERVATION:
			setReservation((Reservation) null);
			return;
		case Mgl845Package.RETOUR__DATE_RETOUR:
			setDateRetour(DATE_RETOUR_EDEFAULT);
			return;
		case Mgl845Package.RETOUR__ID:
			setId(ID_EDEFAULT);
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
		case Mgl845Package.RETOUR__INSPECTION:
			return inspection != null;
		case Mgl845Package.RETOUR__AGENCEARIVEE:
			return agencearivee != null;
		case Mgl845Package.RETOUR__RESERVATION:
			return reservation != null;
		case Mgl845Package.RETOUR__DATE_RETOUR:
			return DATE_RETOUR_EDEFAULT == null ? dateRetour != null : !DATE_RETOUR_EDEFAULT.equals(dateRetour);
		case Mgl845Package.RETOUR__ID:
			return id != ID_EDEFAULT;
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
		result.append(" (dateRetour: ");
		result.append(dateRetour);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RetourImpl
