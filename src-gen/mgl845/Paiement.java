/**
 */
package mgl845;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paiement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Paiement#getAccompte <em>Accompte</em>}</li>
 *   <li>{@link mgl845.Paiement#getTotal <em>Total</em>}</li>
 *   <li>{@link mgl845.Paiement#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getPaiement()
 * @model
 * @generated
 */
public interface Paiement extends EObject {
	/**
	 * Returns the value of the '<em><b>Accompte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accompte</em>' attribute.
	 * @see #setAccompte(float)
	 * @see mgl845.Mgl845Package#getPaiement_Accompte()
	 * @model
	 * @generated
	 */
	float getAccompte();

	/**
	 * Sets the value of the '{@link mgl845.Paiement#getAccompte <em>Accompte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accompte</em>' attribute.
	 * @see #getAccompte()
	 * @generated
	 */
	void setAccompte(float value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(float)
	 * @see mgl845.Mgl845Package#getPaiement_Total()
	 * @model
	 * @generated
	 */
	float getTotal();

	/**
	 * Sets the value of the '{@link mgl845.Paiement#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(float value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Reservation#getPaiement <em>Paiement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference.
	 * @see #setReservation(Reservation)
	 * @see mgl845.Mgl845Package#getPaiement_Reservation()
	 * @see mgl845.Reservation#getPaiement
	 * @model opposite="paiement"
	 * @generated
	 */
	Reservation getReservation();

	/**
	 * Sets the value of the '{@link mgl845.Paiement#getReservation <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' reference.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(Reservation value);

} // Paiement
