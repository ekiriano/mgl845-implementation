/**
 */
package mgl845.impl;

import java.util.Date;
import mgl845.Commis;
import mgl845.Location;
import mgl845.Mgl845Package;
import mgl845.Voiture;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.LocationImpl#getDureeLocation <em>Duree Location</em>}</li>
 *   <li>{@link mgl845.impl.LocationImpl#getVoiture <em>Voiture</em>}</li>
 *   <li>{@link mgl845.impl.LocationImpl#getCommis <em>Commis</em>}</li>
 *   <li>{@link mgl845.impl.LocationImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mgl845.impl.LocationImpl#isEstApprouvee <em>Est Approuvee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getDureeLocation() <em>Duree Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int DUREE_LOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDureeLocation() <em>Duree Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeLocation()
	 * @generated
	 * @ordered
	 */
	protected int dureeLocation = DUREE_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVoiture() <em>Voiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoiture()
	 * @generated
	 * @ordered
	 */
	protected Voiture voiture;

	/**
	 * The cached value of the '{@link #getCommis() <em>Commis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommis()
	 * @generated
	 * @ordered
	 */
	protected Commis commis;

	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected Date dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstApprouvee() <em>Est Approuvee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstApprouvee()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_APPROUVEE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstApprouvee() <em>Est Approuvee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstApprouvee()
	 * @generated
	 * @ordered
	 */
	protected boolean estApprouvee = EST_APPROUVEE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDureeLocation() {
		return dureeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeLocation(int newDureeLocation) {
		int oldDureeLocation = dureeLocation;
		dureeLocation = newDureeLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.LOCATION__DUREE_LOCATION,
					oldDureeLocation, dureeLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voiture getVoiture() {
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
					Mgl845Package.LOCATION__VOITURE, oldVoiture, newVoiture);
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
				msgs = ((InternalEObject) voiture).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mgl845Package.LOCATION__VOITURE, null, msgs);
			if (newVoiture != null)
				msgs = ((InternalEObject) newVoiture).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mgl845Package.LOCATION__VOITURE, null, msgs);
			msgs = basicSetVoiture(newVoiture, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.LOCATION__VOITURE, newVoiture,
					newVoiture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commis getCommis() {
		if (commis != null && commis.eIsProxy()) {
			InternalEObject oldCommis = (InternalEObject) commis;
			commis = (Commis) eResolveProxy(oldCommis);
			if (commis != oldCommis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.LOCATION__COMMIS, oldCommis,
							commis));
			}
		}
		return commis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commis basicGetCommis() {
		return commis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommis(Commis newCommis, NotificationChain msgs) {
		Commis oldCommis = commis;
		commis = newCommis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.LOCATION__COMMIS, oldCommis, newCommis);
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
	public void setCommis(Commis newCommis) {
		if (newCommis != commis) {
			NotificationChain msgs = null;
			if (commis != null)
				msgs = ((InternalEObject) commis).eInverseRemove(this, Mgl845Package.COMMIS__LOCATION, Commis.class,
						msgs);
			if (newCommis != null)
				msgs = ((InternalEObject) newCommis).eInverseAdd(this, Mgl845Package.COMMIS__LOCATION, Commis.class,
						msgs);
			msgs = basicSetCommis(newCommis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.LOCATION__COMMIS, newCommis,
					newCommis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(Date newDateDebut) {
		Date oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.LOCATION__DATE_DEBUT, oldDateDebut,
					dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstApprouvee() {
		return estApprouvee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstApprouvee(boolean newEstApprouvee) {
		boolean oldEstApprouvee = estApprouvee;
		estApprouvee = newEstApprouvee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.LOCATION__EST_APPROUVEE,
					oldEstApprouvee, estApprouvee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.LOCATION__COMMIS:
			if (commis != null)
				msgs = ((InternalEObject) commis).eInverseRemove(this, Mgl845Package.COMMIS__LOCATION, Commis.class,
						msgs);
			return basicSetCommis((Commis) otherEnd, msgs);
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
		case Mgl845Package.LOCATION__VOITURE:
			return basicSetVoiture(null, msgs);
		case Mgl845Package.LOCATION__COMMIS:
			return basicSetCommis(null, msgs);
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
		case Mgl845Package.LOCATION__DUREE_LOCATION:
			return getDureeLocation();
		case Mgl845Package.LOCATION__VOITURE:
			return getVoiture();
		case Mgl845Package.LOCATION__COMMIS:
			if (resolve)
				return getCommis();
			return basicGetCommis();
		case Mgl845Package.LOCATION__DATE_DEBUT:
			return getDateDebut();
		case Mgl845Package.LOCATION__EST_APPROUVEE:
			return isEstApprouvee();
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
		case Mgl845Package.LOCATION__DUREE_LOCATION:
			setDureeLocation((Integer) newValue);
			return;
		case Mgl845Package.LOCATION__VOITURE:
			setVoiture((Voiture) newValue);
			return;
		case Mgl845Package.LOCATION__COMMIS:
			setCommis((Commis) newValue);
			return;
		case Mgl845Package.LOCATION__DATE_DEBUT:
			setDateDebut((Date) newValue);
			return;
		case Mgl845Package.LOCATION__EST_APPROUVEE:
			setEstApprouvee((Boolean) newValue);
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
		case Mgl845Package.LOCATION__DUREE_LOCATION:
			setDureeLocation(DUREE_LOCATION_EDEFAULT);
			return;
		case Mgl845Package.LOCATION__VOITURE:
			setVoiture((Voiture) null);
			return;
		case Mgl845Package.LOCATION__COMMIS:
			setCommis((Commis) null);
			return;
		case Mgl845Package.LOCATION__DATE_DEBUT:
			setDateDebut(DATE_DEBUT_EDEFAULT);
			return;
		case Mgl845Package.LOCATION__EST_APPROUVEE:
			setEstApprouvee(EST_APPROUVEE_EDEFAULT);
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
		case Mgl845Package.LOCATION__DUREE_LOCATION:
			return dureeLocation != DUREE_LOCATION_EDEFAULT;
		case Mgl845Package.LOCATION__VOITURE:
			return voiture != null;
		case Mgl845Package.LOCATION__COMMIS:
			return commis != null;
		case Mgl845Package.LOCATION__DATE_DEBUT:
			return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
		case Mgl845Package.LOCATION__EST_APPROUVEE:
			return estApprouvee != EST_APPROUVEE_EDEFAULT;
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
		result.append(" (dureeLocation: ");
		result.append(dureeLocation);
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", estApprouvee: ");
		result.append(estApprouvee);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
