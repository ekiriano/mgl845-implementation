/**
 */
package mgl845;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Categorie#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getCategorie()
 * @model
 * @generated
 */
public interface Categorie extends EObject {

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Reservation#getCategorie <em>Categorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference.
	 * @see #setReservation(Reservation)
	 * @see mgl845.Mgl845Package#getCategorie_Reservation()
	 * @see mgl845.Reservation#getCategorie
	 * @model opposite="categorie" required="true"
	 * @generated
	 */
	Reservation getReservation();

	/**
	 * Sets the value of the '{@link mgl845.Categorie#getReservation <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' reference.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(Reservation value);
} // Categorie
