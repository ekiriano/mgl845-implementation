/**
 */
package mgl845.impl;

import java.util.Collection;

import mgl845.Agence;
import mgl845.AgenceArivee;
import mgl845.AgenceDepart;
import mgl845.Mgl845Package;
import mgl845.Transfet;
import mgl845.Voiture;

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
 * An implementation of the model object '<em><b>Agence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.AgenceImpl#getId <em>Id</em>}</li>
 *   <li>{@link mgl845.impl.AgenceImpl#getNbVoitureDisponibles <em>Nb Voiture Disponibles</em>}</li>
 *   <li>{@link mgl845.impl.AgenceImpl#getVoiture <em>Voiture</em>}</li>
 *   <li>{@link mgl845.impl.AgenceImpl#getAgencedepart <em>Agencedepart</em>}</li>
 *   <li>{@link mgl845.impl.AgenceImpl#getAgencearivee <em>Agencearivee</em>}</li>
 *   <li>{@link mgl845.impl.AgenceImpl#getTransfet <em>Transfet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgenceImpl extends MinimalEObjectImpl.Container implements Agence {
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
	 * The default value of the '{@link #getNbVoitureDisponibles() <em>Nb Voiture Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbVoitureDisponibles()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_VOITURE_DISPONIBLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbVoitureDisponibles() <em>Nb Voiture Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbVoitureDisponibles()
	 * @generated
	 * @ordered
	 */
	protected int nbVoitureDisponibles = NB_VOITURE_DISPONIBLES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVoiture() <em>Voiture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoiture()
	 * @generated
	 * @ordered
	 */
	protected EList<Voiture> voiture;

	/**
	 * The cached value of the '{@link #getAgencedepart() <em>Agencedepart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgencedepart()
	 * @generated
	 * @ordered
	 */
	protected AgenceDepart agencedepart;

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
	 * The cached value of the '{@link #getTransfet() <em>Transfet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransfet()
	 * @generated
	 * @ordered
	 */
	protected Transfet transfet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.AGENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.AGENCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbVoitureDisponibles() {
		return nbVoitureDisponibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbVoitureDisponibles(int newNbVoitureDisponibles) {
		int oldNbVoitureDisponibles = nbVoitureDisponibles;
		nbVoitureDisponibles = newNbVoitureDisponibles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.AGENCE__NB_VOITURE_DISPONIBLES,
					oldNbVoitureDisponibles, nbVoitureDisponibles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Voiture> getVoiture() {
		if (voiture == null) {
			voiture = new EObjectContainmentEList<Voiture>(Voiture.class, this, Mgl845Package.AGENCE__VOITURE);
		}
		return voiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceDepart getAgencedepart() {
		if (agencedepart != null && agencedepart.eIsProxy()) {
			InternalEObject oldAgencedepart = (InternalEObject) agencedepart;
			agencedepart = (AgenceDepart) eResolveProxy(oldAgencedepart);
			if (agencedepart != oldAgencedepart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.AGENCE__AGENCEDEPART,
							oldAgencedepart, agencedepart));
			}
		}
		return agencedepart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgenceDepart basicGetAgencedepart() {
		return agencedepart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgencedepart(AgenceDepart newAgencedepart) {
		AgenceDepart oldAgencedepart = agencedepart;
		agencedepart = newAgencedepart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.AGENCE__AGENCEDEPART, oldAgencedepart,
					agencedepart));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.AGENCE__AGENCEARIVEE,
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
	public void setAgencearivee(AgenceArivee newAgencearivee) {
		AgenceArivee oldAgencearivee = agencearivee;
		agencearivee = newAgencearivee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.AGENCE__AGENCEARIVEE, oldAgencearivee,
					agencearivee));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.AGENCE__TRANSFET,
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
					Mgl845Package.AGENCE__TRANSFET, oldTransfet, newTransfet);
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
				msgs = ((InternalEObject) transfet).eInverseRemove(this, Mgl845Package.TRANSFET__AGENCE, Transfet.class,
						msgs);
			if (newTransfet != null)
				msgs = ((InternalEObject) newTransfet).eInverseAdd(this, Mgl845Package.TRANSFET__AGENCE, Transfet.class,
						msgs);
			msgs = basicSetTransfet(newTransfet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.AGENCE__TRANSFET, newTransfet,
					newTransfet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.AGENCE__TRANSFET:
			if (transfet != null)
				msgs = ((InternalEObject) transfet).eInverseRemove(this, Mgl845Package.TRANSFET__AGENCE, Transfet.class,
						msgs);
			return basicSetTransfet((Transfet) otherEnd, msgs);
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
		case Mgl845Package.AGENCE__VOITURE:
			return ((InternalEList<?>) getVoiture()).basicRemove(otherEnd, msgs);
		case Mgl845Package.AGENCE__TRANSFET:
			return basicSetTransfet(null, msgs);
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
		case Mgl845Package.AGENCE__ID:
			return getId();
		case Mgl845Package.AGENCE__NB_VOITURE_DISPONIBLES:
			return getNbVoitureDisponibles();
		case Mgl845Package.AGENCE__VOITURE:
			return getVoiture();
		case Mgl845Package.AGENCE__AGENCEDEPART:
			if (resolve)
				return getAgencedepart();
			return basicGetAgencedepart();
		case Mgl845Package.AGENCE__AGENCEARIVEE:
			if (resolve)
				return getAgencearivee();
			return basicGetAgencearivee();
		case Mgl845Package.AGENCE__TRANSFET:
			if (resolve)
				return getTransfet();
			return basicGetTransfet();
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
		case Mgl845Package.AGENCE__ID:
			setId((Integer) newValue);
			return;
		case Mgl845Package.AGENCE__NB_VOITURE_DISPONIBLES:
			setNbVoitureDisponibles((Integer) newValue);
			return;
		case Mgl845Package.AGENCE__VOITURE:
			getVoiture().clear();
			getVoiture().addAll((Collection<? extends Voiture>) newValue);
			return;
		case Mgl845Package.AGENCE__AGENCEDEPART:
			setAgencedepart((AgenceDepart) newValue);
			return;
		case Mgl845Package.AGENCE__AGENCEARIVEE:
			setAgencearivee((AgenceArivee) newValue);
			return;
		case Mgl845Package.AGENCE__TRANSFET:
			setTransfet((Transfet) newValue);
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
		case Mgl845Package.AGENCE__ID:
			setId(ID_EDEFAULT);
			return;
		case Mgl845Package.AGENCE__NB_VOITURE_DISPONIBLES:
			setNbVoitureDisponibles(NB_VOITURE_DISPONIBLES_EDEFAULT);
			return;
		case Mgl845Package.AGENCE__VOITURE:
			getVoiture().clear();
			return;
		case Mgl845Package.AGENCE__AGENCEDEPART:
			setAgencedepart((AgenceDepart) null);
			return;
		case Mgl845Package.AGENCE__AGENCEARIVEE:
			setAgencearivee((AgenceArivee) null);
			return;
		case Mgl845Package.AGENCE__TRANSFET:
			setTransfet((Transfet) null);
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
		case Mgl845Package.AGENCE__ID:
			return id != ID_EDEFAULT;
		case Mgl845Package.AGENCE__NB_VOITURE_DISPONIBLES:
			return nbVoitureDisponibles != NB_VOITURE_DISPONIBLES_EDEFAULT;
		case Mgl845Package.AGENCE__VOITURE:
			return voiture != null && !voiture.isEmpty();
		case Mgl845Package.AGENCE__AGENCEDEPART:
			return agencedepart != null;
		case Mgl845Package.AGENCE__AGENCEARIVEE:
			return agencearivee != null;
		case Mgl845Package.AGENCE__TRANSFET:
			return transfet != null;
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
		result.append(", nbVoitureDisponibles: ");
		result.append(nbVoitureDisponibles);
		result.append(')');
		return result.toString();
	}

} //AgenceImpl
