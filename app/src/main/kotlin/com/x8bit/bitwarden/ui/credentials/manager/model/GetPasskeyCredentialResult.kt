package com.x8bit.bitwarden.ui.credentials.manager.model

import com.bitwarden.ui.util.Text
import com.bitwarden.vault.LoginView

/**
 * Represents the result of Passkey authentication.
 */
sealed class GetPasskeyCredentialResult {
    /**
     * Represents a successful authentication of Passkey credentials.
     */
    data class Success(val responseJson: String) : GetPasskeyCredentialResult()

    /**
     * Indicates the user cancelled authentication.
     */
    data object Cancelled : GetPasskeyCredentialResult()

    /**
     * Represents an error during Passkey credential assertion.
     */
    data class Error(val message: Text) : GetPasskeyCredentialResult()
}
