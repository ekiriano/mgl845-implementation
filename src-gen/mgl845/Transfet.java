/**
 */
package mgl845;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.Transfet#getVoiture <em>Voiture</em>}</li>
 *   <li>{@link mgl845.Transfet#getAgence <em>Agence</em>}</li>
 *   <li>{@link mgl845.Transfet#getDateTransfert <em>Date Transfert</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getTransfet()
 * @model
 * @generated
 */
public interface Transfet extends EObject {
	/**
	 * Returns the value of the '<em><b>Voiture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Voiture#getTransfet <em>Transfet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voiture</em>' reference.
	 * @see #setVoiture(Voiture)
	 * @see mgl845.Mgl845Package#getTransfet_Voiture()
	 * @see mgl845.Voiture#getTransfet
	 * @model opposite="transfet"
	 * @generated
	 */
	Voiture getVoiture();

	/**
	 * Sets the value of the '{@link mgl845.Transfet#getVoiture <em>Voiture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voiture</em>' reference.
	 * @see #getVoiture()
	 * @generated
	 */
	void setVoiture(Voiture value);

	/**
	 * Returns the value of the '<em><b>Agence</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mgl845.Agence#getTransfet <em>Transfet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agence</em>' reference.
	 * @see #setAgence(Agence)
	 * @see mgl845.Mgl845Package#getTransfet_Agence()
	 * @see mgl845.Agence#getTransfet
	 * @model opposite="transfet"
	 * @generated
	 */
	Agence getAgence();

	/**
	 * Sets the value of the '{@link mgl845.Transfet#getAgence <em>Agence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agence</em>' reference.
	 * @see #getAgence()
	 * @generated
	 */
	void setAgence(Agence value);

	/**
	 * Returns the value of the '<em><b>Date Transfert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Transfert</em>' attribute.
	 * @see #setDateTransfert(Date)
	 * @see mgl845.Mgl845Package#getTransfet_DateTransfert()
	 * @model
	 * @generated
	 */
	Date getDateTransfert();

	/**
	 * Sets the value of the '{@link mgl845.Transfet#getDateTransfert <em>Date Transfert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Transfert</em>' attribute.
	 * @see #getDateTransfert()
	 * @generated
	 */
	void setDateTransfert(Date value);

} // Transfet
