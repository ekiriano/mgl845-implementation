/**
 */
package mgl845;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dossier Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgl845.DossierClient#getNumeroDossier <em>Numero Dossier</em>}</li>
 *   <li>{@link mgl845.DossierClient#getNbInfraction <em>Nb Infraction</em>}</li>
 *   <li>{@link mgl845.DossierClient#getInspection <em>Inspection</em>}</li>
 * </ul>
 *
 * @see mgl845.Mgl845Package#getDossierClient()
 * @model
 * @generated
 */
public interface DossierClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Dossier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Dossier</em>' attribute.
	 * @see #setNumeroDossier(int)
	 * @see mgl845.Mgl845Package#getDossierClient_NumeroDossier()
	 * @model
	 * @generated
	 */
	int getNumeroDossier();

	/**
	 * Sets the value of the '{@link mgl845.DossierClient#getNumeroDossier <em>Numero Dossier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Dossier</em>' attribute.
	 * @see #getNumeroDossier()
	 * @generated
	 */
	void setNumeroDossier(int value);

	/**
	 * Returns the value of the '<em><b>Nb Infraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Infraction</em>' attribute.
	 * @see #setNbInfraction(int)
	 * @see mgl845.Mgl845Package#getDossierClient_NbInfraction()
	 * @model
	 * @generated
	 */
	int getNbInfraction();

	/**
	 * Sets the value of the '{@link mgl845.DossierClient#getNbInfraction <em>Nb Infraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Infraction</em>' attribute.
	 * @see #getNbInfraction()
	 * @generated
	 */
	void setNbInfraction(int value);

	/**
	 * Returns the value of the '<em><b>Inspection</b></em>' containment reference list.
	 * The list contents are of type {@link mgl845.Inspection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspection</em>' containment reference list.
	 * @see mgl845.Mgl845Package#getDossierClient_Inspection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inspection> getInspection();

} // DossierClient
