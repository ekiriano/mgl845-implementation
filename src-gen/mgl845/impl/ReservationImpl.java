/**
 */
package mgl845.impl;

import mgl845.Categorie;
import mgl845.Client;
import mgl845.Commis;
import mgl845.Mgl845Package;
import mgl845.Paiement;
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
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgl845.impl.ReservationImpl#getClient <em>Client</em>}</li>
 *   <li>{@link mgl845.impl.ReservationImpl#getRetour <em>Retour</em>}</li>
 *   <li>{@link mgl845.impl.ReservationImpl#getPaiement <em>Paiement</em>}</li>
 *   <li>{@link mgl845.impl.ReservationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mgl845.impl.ReservationImpl#getCommis <em>Commis</em>}</li>
 *   <li>{@link mgl845.impl.ReservationImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationImpl extends MinimalEObjectImpl.Container implements Reservation {
	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

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
	 * The cached value of the '{@link #getPaiement() <em>Paiement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaiement()
	 * @generated
	 * @ordered
	 */
	protected Paiement paiement;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected Categorie categorie;

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
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mgl845Package.Literals.RESERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject) client;
			client = (Client) eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.RESERVATION__CLIENT,
							oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(Client newClient, NotificationChain msgs) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.RESERVATION__CLIENT, oldClient, newClient);
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
	public void setClient(Client newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject) client).eInverseRemove(this, Mgl845Package.CLIENT__RESERVATION, Client.class,
						msgs);
			if (newClient != null)
				msgs = ((InternalEObject) newClient).eInverseAdd(this, Mgl845Package.CLIENT__RESERVATION, Client.class,
						msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RESERVATION__CLIENT, newClient,
					newClient));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.RESERVATION__RETOUR,
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
					Mgl845Package.RESERVATION__RETOUR, oldRetour, newRetour);
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
				msgs = ((InternalEObject) retour).eInverseRemove(this, Mgl845Package.RETOUR__RESERVATION, Retour.class,
						msgs);
			if (newRetour != null)
				msgs = ((InternalEObject) newRetour).eInverseAdd(this, Mgl845Package.RETOUR__RESERVATION, Retour.class,
						msgs);
			msgs = basicSetRetour(newRetour, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RESERVATION__RETOUR, newRetour,
					newRetour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paiement getPaiement() {
		if (paiement != null && paiement.eIsProxy()) {
			InternalEObject oldPaiement = (InternalEObject) paiement;
			paiement = (Paiement) eResolveProxy(oldPaiement);
			if (paiement != oldPaiement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.RESERVATION__PAIEMENT,
							oldPaiement, paiement));
			}
		}
		return paiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paiement basicGetPaiement() {
		return paiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaiement(Paiement newPaiement, NotificationChain msgs) {
		Paiement oldPaiement = paiement;
		paiement = newPaiement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.RESERVATION__PAIEMENT, oldPaiement, newPaiement);
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
	public void setPaiement(Paiement newPaiement) {
		if (newPaiement != paiement) {
			NotificationChain msgs = null;
			if (paiement != null)
				msgs = ((InternalEObject) paiement).eInverseRemove(this, Mgl845Package.PAIEMENT__RESERVATION,
						Paiement.class, msgs);
			if (newPaiement != null)
				msgs = ((InternalEObject) newPaiement).eInverseAdd(this, Mgl845Package.PAIEMENT__RESERVATION,
						Paiement.class, msgs);
			msgs = basicSetPaiement(newPaiement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RESERVATION__PAIEMENT, newPaiement,
					newPaiement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie getCategorie() {
		if (categorie != null && categorie.eIsProxy()) {
			InternalEObject oldCategorie = (InternalEObject) categorie;
			categorie = (Categorie) eResolveProxy(oldCategorie);
			if (categorie != oldCategorie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.RESERVATION__CATEGORIE,
							oldCategorie, categorie));
			}
		}
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categorie basicGetCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategorie(Categorie newCategorie, NotificationChain msgs) {
		Categorie oldCategorie = categorie;
		categorie = newCategorie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mgl845Package.RESERVATION__CATEGORIE, oldCategorie, newCategorie);
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
	public void setCategorie(Categorie newCategorie) {
		if (newCategorie != categorie) {
			NotificationChain msgs = null;
			if (categorie != null)
				msgs = ((InternalEObject) categorie).eInverseRemove(this, Mgl845Package.CATEGORIE__RESERVATION,
						Categorie.class, msgs);
			if (newCategorie != null)
				msgs = ((InternalEObject) newCategorie).eInverseAdd(this, Mgl845Package.CATEGORIE__RESERVATION,
						Categorie.class, msgs);
			msgs = basicSetCategorie(newCategorie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RESERVATION__CATEGORIE, newCategorie,
					newCategorie));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mgl845Package.RESERVATION__COMMIS,
							oldCommis, commis));
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
					Mgl845Package.RESERVATION__COMMIS, oldCommis, newCommis);
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
				msgs = ((InternalEObject) commis).eInverseRemove(this, Mgl845Package.COMMIS__RESERVATION, Commis.class,
						msgs);
			if (newCommis != null)
				msgs = ((InternalEObject) newCommis).eInverseAdd(this, Mgl845Package.COMMIS__RESERVATION, Commis.class,
						msgs);
			msgs = basicSetCommis(newCommis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RESERVATION__COMMIS, newCommis,
					newCommis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mgl845Package.RESERVATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mgl845Package.RESERVATION__CLIENT:
			if (client != null)
				msgs = ((InternalEObject) client).eInverseRemove(this, Mgl845Package.CLIENT__RESERVATION, Client.class,
						msgs);
			return basicSetClient((Client) otherEnd, msgs);
		case Mgl845Package.RESERVATION__RETOUR:
			if (retour != null)
				msgs = ((InternalEObject) retour).eInverseRemove(this, Mgl845Package.RETOUR__RESERVATION, Retour.class,
						msgs);
			return basicSetRetour((Retour) otherEnd, msgs);
		case Mgl845Package.RESERVATION__PAIEMENT:
			if (paiement != null)
				msgs = ((InternalEObject) paiement).eInverseRemove(this, Mgl845Package.PAIEMENT__RESERVATION,
						Paiement.class, msgs);
			return basicSetPaiement((Paiement) otherEnd, msgs);
		case Mgl845Package.RESERVATION__CATEGORIE:
			if (categorie != null)
				msgs = ((InternalEObject) categorie).eInverseRemove(this, Mgl845Package.CATEGORIE__RESERVATION,
						Categorie.class, msgs);
			return basicSetCategorie((Categorie) otherEnd, msgs);
		case Mgl845Package.RESERVATION__COMMIS:
			if (commis != null)
				msgs = ((InternalEObject) commis).eInverseRemove(this, Mgl845Package.COMMIS__RESERVATION, Commis.class,
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
		case Mgl845Package.RESERVATION__CLIENT:
			return basicSetClient(null, msgs);
		case Mgl845Package.RESERVATION__RETOUR:
			return basicSetRetour(null, msgs);
		case Mgl845Package.RESERVATION__PAIEMENT:
			return basicSetPaiement(null, msgs);
		case Mgl845Package.RESERVATION__CATEGORIE:
			return basicSetCategorie(null, msgs);
		case Mgl845Package.RESERVATION__COMMIS:
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
		case Mgl845Package.RESERVATION__CLIENT:
			if (resolve)
				return getClient();
			return basicGetClient();
		case Mgl845Package.RESERVATION__RETOUR:
			if (resolve)
				return getRetour();
			return basicGetRetour();
		case Mgl845Package.RESERVATION__PAIEMENT:
			if (resolve)
				return getPaiement();
			return basicGetPaiement();
		case Mgl845Package.RESERVATION__CATEGORIE:
			if (resolve)
				return getCategorie();
			return basicGetCategorie();
		case Mgl845Package.RESERVATION__COMMIS:
			if (resolve)
				return getCommis();
			return basicGetCommis();
		case Mgl845Package.RESERVATION__ID:
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
		case Mgl845Package.RESERVATION__CLIENT:
			setClient((Client) newValue);
			return;
		case Mgl845Package.RESERVATION__RETOUR:
			setRetour((Retour) newValue);
			return;
		case Mgl845Package.RESERVATION__PAIEMENT:
			setPaiement((Paiement) newValue);
			return;
		case Mgl845Package.RESERVATION__CATEGORIE:
			setCategorie((Categorie) newValue);
			return;
		case Mgl845Package.RESERVATION__COMMIS:
			setCommis((Commis) newValue);
			return;
		case Mgl845Package.RESERVATION__ID:
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
		case Mgl845Package.RESERVATION__CLIENT:
			setClient((Client) null);
			return;
		case Mgl845Package.RESERVATION__RETOUR:
			setRetour((Retour) null);
			return;
		case Mgl845Package.RESERVATION__PAIEMENT:
			setPaiement((Paiement) null);
			return;
		case Mgl845Package.RESERVATION__CATEGORIE:
			setCategorie((Categorie) null);
			return;
		case Mgl845Package.RESERVATION__COMMIS:
			setCommis((Commis) null);
			return;
		case Mgl845Package.RESERVATION__ID:
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
		case Mgl845Package.RESERVATION__CLIENT:
			return client != null;
		case Mgl845Package.RESERVATION__RETOUR:
			return retour != null;
		case Mgl845Package.RESERVATION__PAIEMENT:
			return paiement != null;
		case Mgl845Package.RESERVATION__CATEGORIE:
			return categorie != null;
		case Mgl845Package.RESERVATION__COMMIS:
			return commis != null;
		case Mgl845Package.RESERVATION__ID:
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
