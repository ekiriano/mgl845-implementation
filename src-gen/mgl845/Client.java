/**
 */
package mgl845;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Client#getReservation <em>Reservation</em>}</li>
 *   <li>{@link mgl845.Client#getDossierclient <em>Dossierclient</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getClient()
 * @model
 * @generated
 */
public interface Client extends Personne {
	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference list.
	 * The list contents are of type {@link mgl845.Reservation}.
	 * It is bidirectional and its opposite is '{@link mgl845.Reservation#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference list.
	 * @see mgl845.Mgl845Package#getClient_Reservation()
	 * @see mgl845.Reservation#getClient
	 * @model opposite="client"
	 * @generated
	 */
	EList<Reservation> getReservation();

	/**
	 * Returns the value of the '<em><b>Dossierclient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dossierclient</em>' containment reference.
	 * @see #setDossierclient(DossierClient)
	 * @see mgl845.Mgl845Package#getClient_Dossierclient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DossierClient getDossierclient();

	/**
	 * Sets the value of the '{@link mgl845.Client#getDossierclient <em>Dossierclient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dossierclient</em>' containment reference.
	 * @see #getDossierclient()
	 * @generated
	 */
	void setDossierclient(DossierClient value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reserver();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void louer();

} // Client
