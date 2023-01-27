package br.com.vratech.payment.endpoint;

import com.vigil.users.dto.ApiAddPassword;
import com.vigil.users.dto.ApiCreateUserInput;
import com.vigil.users.dto.ApiCreatedResponseAddPasswordCredential;
import com.vigil.users.dto.ApiCreatedResponseBulkCreateUser;
import com.vigil.users.dto.ApiCreatedResponseCreateUser;
import com.vigil.users.dto.ApiGetAllUsers;
import com.vigil.users.dto.ApiOkResponseAddPasswordCredentialsToCurrentUser;
import com.vigil.users.dto.ApiOkResponseGetUserByEmail;
import com.vigil.users.dto.ApiOkResponseGetUserById;
import com.vigil.users.dto.ApiOkResponseGetUserByPhone;
import com.vigil.users.dto.ApiOkResponseGetUserByUsername;
import com.vigil.users.dto.ApiOkResponseGetUserGroups;
import com.vigil.users.dto.ApiOkResponseGetUsersCount;
import com.vigil.users.dto.ApiOkResponseUpdatePasswordCredential;
import com.vigil.users.dto.ApiOkResponseUpdateUser;
import com.vigil.users.dto.ApiUpdateUserInput;
import com.vigil.users.endpoint.V1Api;
import jakarta.validation.constraints.DecimalMax;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController("/v1/users")
@Log4j2
public class UserEndpoint implements V1Api {

    @Override
    public ResponseEntity<ApiCreatedResponseAddPasswordCredential> addPasswordCredential(String userId, ApiAddPassword apiAddPassword) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseAddPasswordCredentialsToCurrentUser> addPasswordCredentialsToCurrentUser(ApiAddPassword apiAddPassword) {
        return null;
    }

    @Override
    public ResponseEntity<ApiCreatedResponseBulkCreateUser> bulkCreateUser(List<ApiCreateUserInput> apiCreateUserInput) {
        return null;
    }

    @Override
    public ResponseEntity<ApiCreatedResponseCreateUser> createUser(ApiCreateUserInput apiCreateUserInput) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteTenantUser(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseGetUserByEmail> getUserByEmail(String email) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseGetUserById> getUserById(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseGetUserByPhone> getUserByPhone(String phoneNumber) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseGetUserByUsername> getUserByUsername(String username) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseGetUserGroups> getUserGroups(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<ApiGetAllUsers> getUsers(Optional<BigDecimal> pageOffset, Optional<@DecimalMax("10000") BigDecimal> pageLimit, Optional<String> searchPrefix, Optional<String> sortField, Optional<String> sortOrder, Optional<String> search) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseGetUsersCount> getUsersCount(Optional<String> status) {
        return null;
    }

    @Override
    public ResponseEntity<Void> removeUserFromApp(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseUpdatePasswordCredential> updatePasswordCredential(String userId, ApiAddPassword apiAddPassword) {
        return null;
    }

    @Override
    public ResponseEntity<ApiOkResponseUpdateUser> updateUser(String userId, ApiUpdateUserInput apiUpdateUserInput) {
        return null;
    }
}
