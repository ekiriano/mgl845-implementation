/**
 */
package mgl845;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Reservation#getClient <em>Client</em>}</li>
 *   <li>{@link mgl845.Reservation#getRetour <em>Retour</em>}</li>
 *   <li>{@link mgl845.Reservation#getPaiement <em>Paiement</em>}</li>
 *   <li>{@link mgl845.Reservation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mgl845.Reservation#getCommis <em>Commis</em>}</li>
 *   <li>{@link mgl845.Reservation#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Client#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see mgl845.Mgl845Package#getReservation_Client()
	 * @see mgl845.Client#getReservation
	 * @model opposite="reservation"
	 * @generated
	 */
	Client getClient();

	/**
	 * Sets the value of the '{@link mgl845.Reservation#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Client value);

	/**
	 * Returns the value of the '<em><b>Retour</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Retour#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retour</em>' reference.
	 * @see #setRetour(Retour)
	 * @see mgl845.Mgl845Package#getReservation_Retour()
	 * @see mgl845.Retour#getReservation
	 * @model opposite="reservation"
	 * @generated
	 */
	Retour getRetour();

	/**
	 * Sets the value of the '{@link mgl845.Reservation#getRetour <em>Retour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retour</em>' reference.
	 * @see #getRetour()
	 * @generated
	 */
	void setRetour(Retour value);

	/**
	 * Returns the value of the '<em><b>Paiement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Paiement#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paiement</em>' reference.
	 * @see #setPaiement(Paiement)
	 * @see mgl845.Mgl845Package#getReservation_Paiement()
	 * @see mgl845.Paiement#getReservation
	 * @model opposite="reservation" required="true"
	 * @generated
	 */
	Paiement getPaiement();

	/**
	 * Sets the value of the '{@link mgl845.Reservation#getPaiement <em>Paiement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paiement</em>' reference.
	 * @see #getPaiement()
	 * @generated
	 */
	void setPaiement(Paiement value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Categorie#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' reference.
	 * @see #setCategorie(Categorie)
	 * @see mgl845.Mgl845Package#getReservation_Categorie()
	 * @see mgl845.Categorie#getReservation
	 * @model opposite="reservation" required="true"
	 * @generated
	 */
	Categorie getCategorie();

	/**
	 * Sets the value of the '{@link mgl845.Reservation#getCategorie <em>Categorie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' reference.
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(Categorie value);

	/**
	 * Returns the value of the '<em><b>Commis</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Commis#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commis</em>' reference.
	 * @see #setCommis(Commis)
	 * @see mgl845.Mgl845Package#getReservation_Commis()
	 * @see mgl845.Commis#getReservation
	 * @model opposite="reservation"
	 * @generated
	 */
	Commis getCommis();

	/**
	 * Sets the value of the '{@link mgl845.Reservation#getCommis <em>Commis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commis</em>' reference.
	 * @see #getCommis()
	 * @generated
	 */
	void setCommis(Commis value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see mgl845.Mgl845Package#getReservation_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mgl845.Reservation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Reservation
