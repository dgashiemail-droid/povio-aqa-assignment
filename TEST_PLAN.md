# Test Plan Requirements

This test plan describes how the upcoming features will be tested based on the currently available information. Since requirements are limited, some assumptions are made and risks are noted.

---

# 1. Roles and Permissions (Admin Role)

## What to test
- Verify that an admin user can delete campaigns.
- Verify that a regular user cannot see or use the delete option.
- Verify that deleted campaigns are removed from the campaign list.
- Verify that a regular user cannot delete campaigns via direct URL access.

## How to test
- UI testing using different user roles (admin vs regular user).
- Negative testing by trying to access admin actions as a normal user.
- Regression testing to ensure existing campaign flows still work.

## Assumptions / Risks
- Admin role will be clearly defined in the system.
- Risk: role permissions might not be fully enforced on backend at first release.

---

# 2. User List (Admin View)

## What to test
- Verify that admin can see a list of all users.
- Verify that the list shows name, email, and role for each user.
- Verify that admin can promote a user to admin.
- Verify that admin can demote a user back to regular user.
- Verify that regular users cannot access the user list.

## How to test
- UI testing of user list page as admin.
- Permission testing for non-admin users.
- Verify role changes persist after page refresh or re-login.

## Assumptions / Risks
- User list page will be accessible only to admins.
- Risk: role updates may not reflect immediately in UI.

---

# 3. Campaign Images

## What to test
- Verify that a campaign can be created with an image.
- Verify that campaigns without images still work normally.
- Verify that image thumbnail is shown in campaign list.
- Verify that image is correct and not broken.
- Verify behavior for large or unsupported image files.

## How to test
- UI testing with campaigns with and without images.
- Upload different image formats and sizes.
- Visual check of campaign list thumbnails.

## Assumptions / Risks
- Image upload size and format rules will be defined.
- Risk: broken images or slow loading in campaign list.

---

# Notes
- Manual testing will be used first due to limited feature details.
- Automation tests can be added once UI and behavior are stable.
- Regression testing is required after each release to ensure existing flows are not broken.
